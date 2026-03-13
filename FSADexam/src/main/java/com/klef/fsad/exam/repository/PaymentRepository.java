package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.exam.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>
{

}