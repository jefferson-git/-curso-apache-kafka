package br.com.mspayment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class PaymentDto implements Serializable {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long id;

    @NotBlank(message = "Informe o indentificador do Usuário!")
    private Long idUser;

    @NotBlank(message = "Informe o indentificador do Produto!")
    private Long idProduct;

    @NotBlank(message = "Informe o número do cartão!")
    private Long idCardNumber;
}
