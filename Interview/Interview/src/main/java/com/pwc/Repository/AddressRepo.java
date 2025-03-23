package com.pwc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pwc.Entity.AddressEntity;

public interface AddressRepo extends JpaRepository<AddressEntity, Integer> {

}
