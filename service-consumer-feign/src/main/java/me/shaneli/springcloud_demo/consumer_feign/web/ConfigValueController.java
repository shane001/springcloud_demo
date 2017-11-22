package me.shaneli.springcloud_demo.consumer_feign.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shane
 */
@RestController
public class ConfigValueController {

    @Value("${config_value}")
    private String configValue;

    @RequestMapping(value = "/configvalue", method = RequestMethod.GET)
    public String sayHello() {
        return this.configValue;
    }

}
