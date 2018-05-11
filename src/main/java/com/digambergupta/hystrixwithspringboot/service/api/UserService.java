package com.digambergupta.hystrixwithspringboot.service.api;

import java.util.List;

import com.digambergupta.hystrixwithspringboot.controller.UserController;
import com.digambergupta.hystrixwithspringboot.resources.UserDTO;

/**
 * @author Digamber Gupta
 * Service interface for {@link UserController}
 * @see UserService
 * @since 1.0-SNAPSHOT
 */
public interface UserService {
	List<UserDTO> getUsers();
}
