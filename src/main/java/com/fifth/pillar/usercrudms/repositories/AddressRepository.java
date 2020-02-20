package com.fifth.pillar.usercrudms.repositories;

import com.fifth.pillar.usercrudms.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses")
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address save(@RequestBody Address address);

    List<Address> findAll();
}

