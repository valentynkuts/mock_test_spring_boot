package com.example.demo.cars;

import com.example.demo.IEngine;
import org.springframework.stereotype.Component;

@Component("EngineFast")
public class EngineFast implements IEngine {
    public int work(){
        return 1;
    }
}
