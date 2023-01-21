package br.com.mspayment.controller;

import br.com.mspayment.dto.PaymentDto;
import br.com.mspayment.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PaymentController {

    @GetMapping
    ResponseEntity<Payment> Payment(@RequestBody PaymentDto paymentDto);
}
