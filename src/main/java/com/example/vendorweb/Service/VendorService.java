package com.example.vendorweb.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vendorweb.entities.Vendor;

public interface VendorService {

	Vendor saveVendor(Vendor vendor);

	Vendor updateVendor(Vendor vendor);

	Vendor getVendorById(int id);

	void deleteVendor(Vendor vendor);

	void deleteVendorById(int id);

	List<Vendor> getAllVendors();

}
