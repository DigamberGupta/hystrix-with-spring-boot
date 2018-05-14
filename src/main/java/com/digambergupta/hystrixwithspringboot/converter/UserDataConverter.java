package com.digambergupta.hystrixwithspringboot.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.digambergupta.hystrixwithspringboot.entity.User;
import com.digambergupta.hystrixwithspringboot.resources.UserDTO;

/**
 * Data converter class which convert the employee data to UserDTO data
 *
 * @author Digamber Gupta
 * @since 1.0-SNAPSHOT
 */
public class UserDataConverter {

	private UserDataConverter() {

	}

	public static Optional<List<UserDTO>> convertAndJoinList(final List<User> users) {

		final List<UserDTO> userDTOList = new ArrayList<>();

		for (final User user : users) {
			userDTOList.add(getUserBuilder(user));
		}
		return Optional.of(userDTOList);
	}

	/**
	 * Builder class for UserDTO
	 *
	 * @param user user object
	 * @return UserDTO
	 */
	private static UserDTO getUserBuilder(final User user) {
		final UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setFirstName(user.getFirstName());
		userDTO.setLastName(user.getLastName());
		userDTO.setAddress(user.getAddress());

		return userDTO;
	}
}
