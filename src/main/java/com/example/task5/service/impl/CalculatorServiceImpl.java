package com.example.task5.service.impl;

import com.example.task5.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int multiplication(int x, int y) {
        return x * y;
    }


}
