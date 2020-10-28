package com.example.devops.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qinyy
 * @create 2020/10/28 9:42
 */

@Controller
public class indexController {
    @GetMapping("/")
    public String index()
    {
        return "index";
    }
}
