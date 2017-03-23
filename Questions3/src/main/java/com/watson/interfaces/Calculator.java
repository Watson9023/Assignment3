package com.watson.interfaces;

import org.springframework.context.annotation.Configuration;

/**
 * Created by Long on 3/22/2017.
 */
@Configuration
public interface Calculator {

    float add(float x, float y);
    float multiply(float x, float y);
    float divide(float x, float y);
    float subtract(float x, float y);
}
