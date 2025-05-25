package com.fullstack.springviews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.springviews.entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
