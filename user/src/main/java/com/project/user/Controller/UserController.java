package com.project.user.Controller;

import com.project.user.dto.UserDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/api/User")
@Tag(name = "Usuário", description = "APIs relacionadas a usuários")
public class UserController {

    @GetMapping("/users")
    @Operation(summary = "Listar usuários", description = "Retorna uma lista de usuários cadastrados")
    public List<String> getUsers() {
        return List.of("User1", "User2");
    }

    @GetMapping("/users/by-name")
    @Operation(summary = "Listar usuários por nome", description = "Retorna uma lista de usuários cadastrados por nome")
    public List<String> getUsersByName() {
        return List.of("User1", "User2");
    }

    @PutMapping("/users")
    @Operation(summary = "Atualizar lista de usuários", description = "Atualiza uma lista de usuários cadastrados")
    public List<String> updateUsers() {
        return List.of("User1", "User2");
    }

    @DeleteMapping("/users")
    @Operation(summary = "Listar usuários deletados", description = "Retorna uma lista de usuários deletados")
    public List<String> deleteUsers() {
        return List.of("User1", "User2");
    }

    @PostMapping("/users")
    @Operation(summary = "Adicionar usuário", description = "Adiciona um novo usuário")
    public String addUser(@Valid @RequestBody UserDTO user) {
        return "Usuário adicionado: " + user.getName();
    }
}


