package com.gs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 孟飞
 * @Date 2019/3/20 19:43
 * @Project WrokIdea02 com.gs.food.controller
 * @Description: java类作用描述
 */
@Controller
@RequestMapping("/user")
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "user/index";
    }
}
