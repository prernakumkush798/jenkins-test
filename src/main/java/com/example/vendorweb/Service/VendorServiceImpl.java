package com.example.vendorweb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vendorweb.entities.Vendor;
import com.example.vendorweb.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	public VendorRepository repository;

	public Vendor saveVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	public Vendor updateVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	public Vendor getVendorById(int id) {
		return repository.findById(id).get();
	}

	public void deleteVendor(Vendor vendor) {
		repository.delete(vendor);
	}

	public void deleteVendorById(int id) {
		repository.deleteById(id);
		
	}

	public List<Vendor> getAllVendors() {
		return repository.findAll();
	}

}
