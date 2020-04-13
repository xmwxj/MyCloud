package com.mycloud.services.impl;

import com.mycloud.dao.PaymentDao;
import com.mycloud.entities.Payment;
import com.mycloud.services.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Nansen
 * @create 2020/4/11 15:17
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
