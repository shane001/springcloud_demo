package me.shaneli.springcloud_demo.consumer_feign.service;

import org.springframework.stereotype.Service;

/**
 * @author Shane
 */
@Service
public class HelloWorldServiceFallback implements HelloWorldService {

    @Override
    public String helloWorld() {
        return "hello world fallback";
    }
}
