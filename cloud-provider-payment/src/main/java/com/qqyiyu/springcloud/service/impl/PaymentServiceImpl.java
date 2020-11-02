package com.qqyiyu.springcloud.service.impl;

import com.qqyiyu.springcloud.dao.PaymentDao;
import com.qqyiyu.springcloud.entity.Payment;
import com.qqyiyu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
