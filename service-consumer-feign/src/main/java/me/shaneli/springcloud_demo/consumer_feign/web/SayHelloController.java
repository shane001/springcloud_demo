package me.shaneli.springcloud_demo.consumer_feign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.shaneli.springcloud_demo.consumer_feign.service.HelloWorldService;

/**
 * @author Shane
 */
@RestController
public class SayHelloController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayHello() {
        return this.helloWorldService.helloWorld() + "-feign";
    }

}
