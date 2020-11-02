package com.qqyiyu.springcloud.service;

import com.qqyiyu.springcloud.entity.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
