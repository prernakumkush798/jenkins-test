package com.example.vendorweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vendorweb.entities.Vendor;


public interface VendorRepository extends JpaRepository<Vendor, Integer>{

}
