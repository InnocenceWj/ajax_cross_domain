package com.wj.ajaxclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @创建人 wj
 * @创建时间 2018/11/22
 * @描述 没有经过controller
 */
@Controller
public class TestController {

    @RequestMapping(value = "/test")
    public String getHtml() {
        return "index";
    }
}
