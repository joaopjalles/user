package com.project.user.Controller;

import com.project.user.Address.Address;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    private final Map<Long, Address> addressRepository = new HashMap<>();
    private long currentId = 1;

    @GetMapping
    public ResponseEntity<List<Address>> getAllAddresses() {
        return ResponseEntity.ok(new ArrayList<>(addressRepository.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long id) {
        Address address = addressRepository.get(id);
        if (address != null) {
            return ResponseEntity.ok(address);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        address.setId(String.valueOf(currentId++));
        addressRepository.put(Long.valueOf(address.getId()), address);
        return ResponseEntity.status(HttpStatus.CREATED).body(address);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable Long id, @RequestBody Address updatedAddress) {
        if (addressRepository.containsKey(id)) {
            updatedAddress.setId(String.valueOf(id));
            addressRepository.put(id, updatedAddress);
            return ResponseEntity.ok(updatedAddress);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        if (addressRepository.containsKey(id)) {
            addressRepository.remove(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
