package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component 
public class HelloWorld {
    public static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    public String display(){
        logger.info("program runs successfully");
        logger.warn("Give Valid");
        logger.error("Wrong inject");
        return "Hello World";
    }
}
