package com.devsuperior.clientes.dto;

import com.devsuperior.clientes.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private Long id;

    @NotBlank(message = "Name is required.")
    private String name;
    private String cpf;
    private Double income;

    @PastOrPresent(message = "Birth date must be in the past or present.")
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }
}
