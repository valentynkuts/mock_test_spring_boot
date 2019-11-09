package com.example.demo.controllers;

import com.example.demo.cars.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
Zadanie 1: Test Controller
Utwórz klasę Car, z metodą (nie statyczną) drive() która wyświetla jakiś komunikat.
W klasie TestController w metodzie test(), wywołaj metodę drive() na obiekcie typu Car.
Nie twórz obiektu w tradycyjny sposób, użyj @Autowired.
Niech klasa Car ma w swoich polach klasy Engine i Suspension. Obydwie niech będą wstrzykiwane za pomocą @Autowired.
Każda ma mieć metodę work() która zwraca 1. Przy wywołaniu metody drive() ma ona wywołać metody work() obydwu klas i
wyświetlić komunikat tylko wtedy gdy każda zwróci „1” .
Niech Car ma w swoim polu interfejs zamiast konkretnej klasy Engine. Przygotuj dwie klasy implementujące ten
 interfejs. Użyj @Qualifier, żeby wstrzyknąć jedną z tych klas.

 http://localhost:8080/tests
 */

@RestController
public class TestController {
    @Autowired
    Car car;
    @GetMapping("/test")
    public void test() {
        car.drive();
    }
}
