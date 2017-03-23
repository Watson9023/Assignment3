package com.watson.interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Long on 3/22/2017.
 */
@Configuration
public class ConfigApp {

    @Bean(name = "cal")
    public Calculator getService()
    {
        return new CalculatorImplement();
    }
}
