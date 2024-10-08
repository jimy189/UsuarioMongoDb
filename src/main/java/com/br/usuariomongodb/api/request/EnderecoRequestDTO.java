package com.br.usuario.api.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class EnderecoRequestDTO {
    private String nome;


    private String rua;

    private Long numero;

    private String bairro;

    private String complemento;

    private String cidade;

    private String cep;

}
