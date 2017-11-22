package me.shaneli.springcloud_demo.tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * @author Shane
 */
@SpringBootApplication
@EnableZipkinServer
public class TracingApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TracingApplication.class, args);
    }

}
