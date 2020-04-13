package com.mycloud.services;

import com.mycloud.entities.Payment;

/**
 * @author Nansen
 * @create 2020/4/11 15:16
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
