package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ControllerDemo {
    @Autowired 
    HelloWorld hw;

    @GetMapping("/gethello")
        public String getHelloWorld(){
        return hw.display();
        }
    @GetMapping("/{id}")
        public String getHelloWorldwithid(@PathVariable int id){
            return "Hello world with " + id ;
        }
}
