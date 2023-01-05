package com.example.vendorweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.vendorweb.Service.VendorService;
import com.example.vendorweb.entities.Vendor;

@Controller
public class VendorController {

	@Autowired
	public VendorService service;

	@RequestMapping(value = "/showvendor")
	public String showVendor() {

		return "createVendor";

	}

	@RequestMapping(value = "/savevendor")
	public String addVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelmap) {
		Vendor vendorr = service.saveVendor(vendor);
		String msg = "Vendor created at id : " + vendorr.getId();
		modelmap.addAttribute("msg", msg);
		return "createVendor";

	}

	@RequestMapping("/allVendor")
	public String viewallVendors(Vendor vendor, ModelMap modelmap) {
		List<Vendor> list = service.getAllVendors();
		modelmap.addAttribute("vendors", list);
		return "viewVendors";
	}

	@RequestMapping(value = "/deletevendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelmap) {
		service.deleteVendorById(id);
		List<Vendor> list = service.getAllVendors();
		modelmap.addAttribute("vendors", list);
		return "viewVendors";
	}

	@RequestMapping(value = "/editvendor")
	public String updateVendor(@RequestParam("id") int id, ModelMap modelmap) {
		Vendor vendorById = service.getVendorById(id);

		modelmap.addAttribute("vendors", vendorById);

		return "editVendor";
	}

	@RequestMapping(value = "/updatevendor")
	public String editVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelmap) {
//		Vendor vendorById = service.getVendorById(id);
		service.updateVendor(vendor);

		List<Vendor> list = service.getAllVendors();
		modelmap.addAttribute("vendors", list);
		return "viewVendors";

	}
}
