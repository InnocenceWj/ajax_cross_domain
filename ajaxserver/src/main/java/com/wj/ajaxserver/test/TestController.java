package com.wj.ajaxserver.test;

import com.wj.ajaxserver.entity.User;
import com.wj.ajaxserver.reslut.Result;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/postJson")
    public Result postJson(@RequestBody User user) {
        System.out.println(user);
        return Result.success("post:" + user.getName());
    }


    @GetMapping("/getCookie")
    public Result getCookie(@CookieValue(value = "cookie_parm") String cookie_parm) {
//        注意，cookie值加在被调用方的域内。直接在被调用方浏览器console：document.cookie="cookie_parm=wj"
        System.out.println("getCookie");
        return Result.success("getCookie:" + cookie_parm);
    }

    @GetMapping("/getHeader")
    public Result getHeader(@RequestHeader(value = "x-header1") String header1,@RequestHeader(value = "x-header2") String header2) {
        System.out.println("getHeader");
        return Result.success("getHeader:"+header1+" "+header2);
    }

}
