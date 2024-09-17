package com.ty.address.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class Address {

    @Id
    private String addrId;
    private String buildingName;
    private String empId;
    private int buildingNumber;
    private String city;
    private int pincode;

}
