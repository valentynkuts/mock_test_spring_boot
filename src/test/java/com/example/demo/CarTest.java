package com.example.demo;


import com.example.demo.cars.Car;
import com.example.demo.cars.Suspension;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CarTest {
    @Mock
    IEngine mockEngine;
    @Mock
    Suspension mockSuspension;

    @InjectMocks
    Car car;


    @Test
    public void mockTest() {

        Mockito.when(mockEngine.work()).thenReturn(2);
        Mockito.when(mockSuspension.work()).thenReturn(1);
        assertEquals(1, car.drive());

        Mockito.when(mockEngine.work()).thenReturn(1);
        Mockito.when(mockSuspension.work()).thenReturn(1);
        assertEquals(2, car.drive());

        Mockito.when(mockEngine.work()).thenReturn(0);
        Mockito.when(mockSuspension.work()).thenReturn(1);
        assertEquals(3, car.drive());

        Mockito.when(mockEngine.work()).thenReturn(0);
        Mockito.when(mockSuspension.work()).thenReturn(0);
        assertEquals(4, car.drive());

        Mockito.when(mockEngine.work()).thenReturn(-1);
        Mockito.when(mockSuspension.work()).thenReturn(-1);
        assertEquals(5, car.drive());


    }
}
