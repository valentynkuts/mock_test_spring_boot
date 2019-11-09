package EngineSuspensionMockToTestCar;


import com.example.demo.IEngine;
import com.example.demo.cars.Car;
import com.example.demo.cars.Engine;
import com.example.demo.cars.Suspension;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class CarTest {
    @MockBean
    IEngine mockEngine;
    @MockBean
    Suspension mockSuspension;

    //@Autowired
    //'Car car;


    @Test
    public void mockTest() {

        Car c = new Car(mockEngine,mockSuspension);

        Mockito.when(mockEngine.work()).thenReturn(2);
        Mockito.when(mockSuspension.work()).thenReturn(1);
        assertEquals(1, c.drive());

//        Mockito.when(mockEngine.work()).thenReturn(1);
//        Mockito.when(mockSuspension.work()).thenReturn(1);
//        assertEquals(2, c.drive());
//
//        Mockito.when(mockEngine.work()).thenReturn(0);
//        Mockito.when(mockSuspension.work()).thenReturn(1);
//        assertEquals(3, c.drive());
//
//        Mockito.when(mockEngine.work()).thenReturn(0);
//        Mockito.when(mockSuspension.work()).thenReturn(0);
//        assertEquals(4, c.drive());
//
//        Mockito.when(mockEngine.work()).thenReturn(-1);
//        Mockito.when(mockSuspension.work()).thenReturn(-1);
//        assertEquals(5, c.drive());


    }
}
