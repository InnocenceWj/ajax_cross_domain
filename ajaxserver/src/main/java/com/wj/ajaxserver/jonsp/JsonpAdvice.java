package com.wj.ajaxserver.jonsp;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * @创建人 wj
 * @创建时间 2018/11/22
 * @描述
 */
@ControllerAdvice
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {
    public JsonpAdvice() {
//        jsonp请求携带一个前后台约定的参数（默认参数：callback，不能写成callback1这类），便于让后台识别是jsonp请求，后台则返回js数据而非json数据
        super("callback");
    }
}
