package com.lht.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot
 * @Package: com.lht.springboot.controller
 * @ClassName: DemoController
 * @Author: lihantao
 * @Description: demo
 * @Date: 2020/6/30 12:11 上午
 * @Version: 1.0
 */
@Api
@RestController
public class DemoController {

    @ApiOperation("demo测试")
    @GetMapping
    public String demo() {
        return "Hello World";
    }

}
