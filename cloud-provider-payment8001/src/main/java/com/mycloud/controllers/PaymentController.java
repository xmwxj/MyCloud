package com.mycloud.controllers;

import com.mycloud.entities.CommonResult;
import com.mycloud.entities.Payment;
import com.mycloud.services.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Nansen
 * @create 2020/4/11 15:19
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService service;

    @PostMapping("payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = service.create(payment);
        System.out.println("result = " + result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping("payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id){
        Payment payment = service.getPaymentById(id);
//        System.out.println("result = " + result);
//        if(result>0){
//            return new CommonResult(200,"插入数据库成功",result);
//        }else{
//            return new CommonResult(444,"插入数据库失败",null);
//        }
    }
}
