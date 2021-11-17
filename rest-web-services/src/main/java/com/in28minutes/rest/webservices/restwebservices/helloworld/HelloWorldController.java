package com.in28minutes.rest.webservices.restwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    /**
     * prints hellow world
     */
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    HelloWorldBean hello() {
        return new HelloWorldBean("omer");
    }
    @GetMapping( path = "/hello-world-beam")
    HelloWorldBean helloBeam() {
        return new HelloWorldBean("omer");
    }
    @GetMapping( path = "/hello-world-beam/{name}")
    HelloWorldBean helloBeamPath(@PathVariable String name) {
        return new HelloWorldBean("omer  :"+name);
    }

}
