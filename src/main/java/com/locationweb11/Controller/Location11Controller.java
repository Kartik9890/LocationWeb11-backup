package com.locationweb11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb11.entities.Location;
import com.locationweb11.services.Location11Service;
import com.locationweb11.utility.EmailService;

@Controller
public class Location11Controller {

	@Autowired
	private Location11Service locationService;
	
	@Autowired
	private EmailService emailService;
	
	
	@RequestMapping("/show11")
	public String showLocationPage() {
		return "create_location11";
	}
	
	@RequestMapping ("/saveLocation")
	public String saveLocationData(Location location, ModelMap model) {
		locationService.saveLocation(location);
		emailService.sendSimpleMessage("kartikpatil.hande@gmail.com", "test", "Welcome11");
		model.addAttribute("msg","location is saved");
		return"create_location11";
	}
	@RequestMapping ("/listall")
	public String listAll( ModelMap model) {
		List<Location> list11 = locationService.getAllLocations();
		model.addAttribute("list11",list11);
		System.out.println(list11);
		return"search_result11";
	}
	
	@RequestMapping("/delete")
	public String delete11Location(@RequestParam("id")long id, ModelMap model) {
		System.out.println(id);
		locationService.deleteLocationById(id);
		List<Location> list11 = locationService.getAllLocations();
		model.addAttribute("list11",list11);
		return"search_result11";
	}
	@RequestMapping("/update")
	public String update11Location(@RequestParam("id")long id, ModelMap model) {
		Location location = locationService.getLocationById(id);
		model.addAttribute("location", location);
		return"updateLocation11";
	}
	@RequestMapping("/update11")
	public String updateLocationData(@ModelAttribute("list11") Location location, ModelMap model) {
		locationService.saveLocation(location);
		model.addAttribute("msg", "location is updated!!");
		return"updateLocation11";
	}
}
