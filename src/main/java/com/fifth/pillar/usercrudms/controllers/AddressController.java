package com.fifth.pillar.usercrudms.controllers;

import com.fifth.pillar.usercrudms.models.Address;
import com.fifth.pillar.usercrudms.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/address")
@CrossOrigin(origins = "*")
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public ResponseEntity<List<Address>> getAllAddresses() {
        List<Address> addressList = addressService.getAllAddresses();
        return new ResponseEntity<>(addressList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Address> addAddress(@RequestBody Address address) {
        Address storedAddress = addressService.addAddress(address);
        return new ResponseEntity<>(storedAddress, HttpStatus.OK);
    }
}
