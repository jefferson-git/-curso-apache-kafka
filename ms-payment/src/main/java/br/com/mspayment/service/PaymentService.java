package br.com.mspayment.service;

import br.com.mspayment.dto.PaymentDto;

public interface PaymentService {

    void sendPayment(PaymentDto dto);

}
