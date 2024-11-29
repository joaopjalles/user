package com.project.user.Address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Address implements Serializable {

    @Id
    private String id;
    private String socialId;
    private String street;
    private String state;
    private String country;
    private String city;

    @Column(name = "zip_code")
    private String zipecode;

    private String number;
}
