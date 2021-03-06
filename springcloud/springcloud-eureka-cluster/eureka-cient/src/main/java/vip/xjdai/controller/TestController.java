package vip.xjdai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/hello")
    public String hello(String name) {
        return name + "=============" + port;
    }
}
