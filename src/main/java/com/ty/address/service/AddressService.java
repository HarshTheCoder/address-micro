package com.ty.address.service;

import com.ty.address.entities.Address;
import com.ty.address.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@RequiredArgsConstructor
@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public Address saveAddress(Address address) {
        address.setAddrId(UUID.randomUUID().toString());
        Address savedAddr = addressRepository.save(address);
        return savedAddr;
    }

    public Address findAddress(String empId){
        return addressRepository.findByEmpId(empId)
                .orElseThrow(()-> new RuntimeException("Address Not Found for Employee"));
    }
}
