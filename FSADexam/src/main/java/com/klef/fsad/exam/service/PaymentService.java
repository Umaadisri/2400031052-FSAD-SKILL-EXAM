package com.klef.fsad.exam.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.Payment;
import com.klef.fsad.exam.repository.PaymentRepository;

@Service
public class PaymentService 
{
    @Autowired
    PaymentRepository repo;

    public Payment addPayment(Payment p)
    {
        return repo.save(p);
    }

    public List<Payment> getPayments()
    {
        return repo.findAll();
    }
}