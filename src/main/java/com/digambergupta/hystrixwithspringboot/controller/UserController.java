package com.digambergupta.hystrixwithspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digambergupta.hystrixwithspringboot.resources.UserDTO;
import com.digambergupta.hystrixwithspringboot.service.api.UserService;

/**
 * @author Digamber Gupta
 * Controller for UserDTO operation
 * @see UserController
 * @since Version 1.0-SNAPSHOT
 */
@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(final UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("list")
	private HttpEntity<List<UserDTO>> getUsers() {

		List<UserDTO> userDTOList = userService.getUsers();

		return ResponseEntity.ok(userDTOList);
	}
}
