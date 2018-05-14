package com.digambergupta.hystrixwithspringboot.resources;

/**
 * @author Digamber Gupta
 * Pojo class for user Data transfer object
 * @see UserDTO
 * @since 1.0-SNAPSHOT
 */
@SuppressWarnings("unused")
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDTO{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + '}';
	}

}
