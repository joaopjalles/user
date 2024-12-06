package com.project.user.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserDTO {

    @NotBlank(message = "O nome do usuário é obrigatório.")
    @Size(min = 3, max = 15, message = "O nome deve ter entre 3 e 15 caracteres.")
    private String name;

    @NotBlank(message = "O email é obrigatório.")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres.")
    private String email;

    @NotBlank(message = "O nome do usuário é obrigatório.")
    @Size(min = 3, max = 15, message = "A Id deve ter entre 3 e 15 caracteres.")
    private String socialId;

    @NotBlank(message = "O número do usuário é obrigatório.")
    @Size(max = 11, message = "O número deve ter 11 caracteres.")
    private String phone;

    @NotBlank(message = "A senha do usuário é obrigatório.")
    @Size(min = 5, max = 15, message = "A senha deve ter entre 5 e 15 caracteres.")
    private String password;

}
