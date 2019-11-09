package com.example.demo.cars;

import com.example.demo.IEngine;
import org.springframework.stereotype.Component;

@Component("EngineSlow")
public class EngineSlow implements IEngine {
    public int work(){
        return 2;
    }
}
