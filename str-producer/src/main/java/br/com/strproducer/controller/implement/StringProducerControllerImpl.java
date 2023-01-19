package br.com.strproducer.controller.implement;

import br.com.strproducer.controller.StringProducerController;
import br.com.strproducer.service.implement.StringProducerServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/producer")
public class StringProducerControllerImpl implements StringProducerController {

    private final StringProducerServiceImp service;

    @Override
    public ResponseEntity<?> sendMessage(String message) {
        service.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
