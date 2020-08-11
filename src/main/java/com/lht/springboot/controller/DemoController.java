package com.lht.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date endDate = calendar.getTime();
        calendar.add(Calendar.DATE, -1);
        Date time = calendar.getTime();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf1.format(time) + "---" + sdf1.format(endDate));
    }

}
