package com.qqyiyu.springcloud.controller;

import com.qqyiyu.springcloud.entity.Payment;
import com.qqyiyu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    public void create(Payment payment){

    }
}
