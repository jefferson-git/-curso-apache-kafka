package br.com.mspayment.controller.impl;

import br.com.mspayment.controller.PaymentController;
import br.com.mspayment.dto.PaymentDto;
import br.com.mspayment.model.Payment;
import br.com.mspayment.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/payment")
public class PaymentControlerImpl implements PaymentController {

    private final PaymentService service;
    @Override
    public ResponseEntity<Payment> Payment(PaymentDto paymentDto) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
