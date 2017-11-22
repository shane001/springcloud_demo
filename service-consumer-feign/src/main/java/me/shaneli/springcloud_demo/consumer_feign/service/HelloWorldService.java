package me.shaneli.springcloud_demo.consumer_feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Shane
 */
@FeignClient(value = "demo-service-provider", fallback = HelloWorldServiceFallback.class)
public interface HelloWorldService {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    String helloWorld();

}
