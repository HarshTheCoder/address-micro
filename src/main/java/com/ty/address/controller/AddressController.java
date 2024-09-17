package com.ty.address.controller;

import com.ty.address.entities.Address;
import com.ty.address.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/address")
public class AddressController {

    private final AddressService addressService;

    @PostMapping(path="/saveaddr")
    public ResponseEntity<Address> saveAddress(@RequestBody Address address){
        Address savedAddress = addressService.saveAddress(address);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAddress);
    }

    @GetMapping(path = "/fetch")
    public  Address findAddress(@RequestParam String empId) {
        return addressService.findAddress(empId);
    }
}
