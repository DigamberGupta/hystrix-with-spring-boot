package com.digambergupta.hystrixwithspringboot.resources;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Digamber Gupta
 * Pojo class for user Data transfer object
 * @see UserDTO
 * @since 1.0-SNAPSHOT
 */
@Getter
@Setter
public class UserDTO {

	private Long id;

	private String firstName;

	private String lastName;

	private String address;

	public UserDTO() {
	}

	public UserDTO(Long id, String firstName, String lastName, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDTO{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + '}';
	}
}
