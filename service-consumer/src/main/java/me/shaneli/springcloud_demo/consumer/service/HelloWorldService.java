package me.shaneli.springcloud_demo.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Shane
 */
@Service
public class HelloWorldService {

    @Autowired
    private RestTemplate restTemplate;

    public String helloWorld() {
        return this.restTemplate.getForEntity("http://demo-service-provider/helloworld", String.class).getBody();
    }

}
