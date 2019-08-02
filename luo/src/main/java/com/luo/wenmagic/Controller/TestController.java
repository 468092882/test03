package com.luo.wenmagic.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LuoShuai
 * @Date: 2019/6/29 15:43
 */
@RestController
@RequestMapping(value = "main")
public class TestController {

    @GetMapping(value = "test")
    public String Test() {
        return "Hello Word";
    }
}
