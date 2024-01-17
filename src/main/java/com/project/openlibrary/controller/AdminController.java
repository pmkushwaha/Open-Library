package com.project.openlibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> 86663f7 (Admin dashboard is updated)
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.openlibrary.model.Admin;
import com.project.openlibrary.repository.AdminRepository;

@Controller
public class AdminController {
	
	@Autowired
	AdminRepository adminRepository;
	
<<<<<<< HEAD
	// THis is the controller of the login page
=======
>>>>>>> 86663f7 (Admin dashboard is updated)

	@PostMapping("/admin_login")
	public String userLogin(@RequestParam("username") String username, @RequestParam("password") String password) {

		Admin dbAdmin = adminRepository.findByUsername(username);

		// Check if the user exists
		if (dbAdmin == null) {
			return "User not found";
		}

	// Compare the passwords
		if (dbAdmin.getPassword().equals(password)) {
			return "redirect:/admin";
		} else {
			return "adminLoginPage";
		}
	}

<<<<<<< HEAD
=======
	@GetMapping("/admin_team_profile")
	public String viewTeam(Admin admin) {
		return "teamProfile";
	}
>>>>>>> 86663f7 (Admin dashboard is updated)
	
	

}