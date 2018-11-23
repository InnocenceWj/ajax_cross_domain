package com.wj.ajaxserver.test;

import com.wj.ajaxserver.reslut.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 wj
 * @创建时间 2018/11/22
 * @描述
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping("/getResult")
    public Result getResult() {
        System.out.println("getResult");
        return Result.success("success");
    }

}
