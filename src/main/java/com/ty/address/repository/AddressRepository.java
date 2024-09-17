package com.ty.address.repository;

import com.ty.address.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository  extends JpaRepository<Address,String> {
    Optional<Address> findByEmpId(String s);

}
