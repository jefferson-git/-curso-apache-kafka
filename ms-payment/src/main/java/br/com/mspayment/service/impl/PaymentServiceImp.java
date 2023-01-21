package br.com.mspayment.service.impl;

import br.com.mspayment.dto.PaymentDto;
import br.com.mspayment.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImp implements PaymentService {
    @Override
    public void sendPayment(PaymentDto dto) {
        log.info("PAYMENT_SERVICE_IMPL ::: RECEBI O PAGAMENTO {})", dto);
    }
}
