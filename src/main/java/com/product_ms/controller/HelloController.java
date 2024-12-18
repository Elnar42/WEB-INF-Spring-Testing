package com.product_ms.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    private static final Log log = LogFactory.getLog(HelloController.class);

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello(Model model) {
        model.addAttribute("hw", "Hello World");
        log.info("I am here!");
        return "hello";
    }
}
