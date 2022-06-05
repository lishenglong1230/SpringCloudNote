package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Lishenglong
 * @Date: 2022/3/27 20:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    //当对象为null 走特殊构造方法
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
