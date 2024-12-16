package com.project.user.Controller;

import com.project.user.Address.Address;
import com.project.user.Role.Role;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private final Map<Long, Role> roleRepository = new HashMap<>();
    private long currentId = 1;

    @GetMapping
    public ResponseEntity<List<Role>> getAllRoles() {
        return ResponseEntity.ok(new ArrayList<>(roleRepository.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable Long id) {
        Role role = roleRepository.get(id);
        if (role != null) {
            return ResponseEntity.ok(role);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        role.setId(String.valueOf(currentId++));
        roleRepository.put(Long.valueOf(role.getId()), role);
        return ResponseEntity.status(HttpStatus.CREATED).body(role);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Role> updateRole(@PathVariable Long id, @RequestBody Role updatedRole) {
        if (roleRepository.containsKey(id)) {
            updatedRole.setId(String.valueOf(id));
            roleRepository.put(id, updatedRole);
            return ResponseEntity.ok(updatedRole);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRole(@PathVariable Long id) {
        if (roleRepository.containsKey(id)) {
            roleRepository.remove(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
