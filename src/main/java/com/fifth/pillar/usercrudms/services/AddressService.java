package com.fifth.pillar.usercrudms.services;

import com.fifth.pillar.usercrudms.models.Address;
import com.fifth.pillar.usercrudms.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }
}
