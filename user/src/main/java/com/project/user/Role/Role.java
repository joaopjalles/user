package com.project.user.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Role implements Serializable {

        @Id
        private String id;
        private String socialId;
        private String role;
        private String description;
        private String enabled;
}