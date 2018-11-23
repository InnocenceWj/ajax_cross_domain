package com.wj.ajaxserver.reslut;

/**
 * @创建人 wj
 * @创建时间 2018/11/22
 * @描述 当result作为返回值并要转换成json格式数据（@RestController，@ResponseBody），result应该是标准的bean要包括get、set方法，否则返回不正确
 * 报错： No converter found for return value of type: class com.wj.ajaxserver.reslut.Result
 */
public class Result {
    private final String data;

    public Result(String data) {
        this.data = data;
    }

    public static Result success(String data){
        return new Result(data);
    }

    public static Result fail(String data){
        return new Result(data);
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data='" + data + '\'' +
                '}';
    }
}
