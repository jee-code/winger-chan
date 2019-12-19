package com.maxwit;

import org.springframework.stereotype.Service;

@Service
public class OperationService {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
