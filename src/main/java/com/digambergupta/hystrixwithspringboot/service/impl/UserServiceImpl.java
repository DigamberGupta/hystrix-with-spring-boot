package com.digambergupta.hystrixwithspringboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digambergupta.hystrixwithspringboot.converter.UserDataConverter;
import com.digambergupta.hystrixwithspringboot.dao.UserRepository;
import com.digambergupta.hystrixwithspringboot.resources.UserDTO;
import com.digambergupta.hystrixwithspringboot.service.api.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * @author Digamber Gupta
 * implementation for {@link UserService}
 * @see UserServiceImpl
 * @since 1.0-SNAPSHOT
 */
@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	@HystrixCommand(fallbackMethod = "longExecutionTime",
					commandProperties = { @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1"),
							@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
							@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "20000"),
							@HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "10000") })
	public List<UserDTO> getUsers() {
		return UserDataConverter.convertAndJoinList(userRepository.findAll()).orElseThrow(null);
	}

	/**
	 * fallback method used by HystrixCommand annotation
	 *
	 * @return List of UserDTO
	 */
	@SuppressWarnings("unused")
	public List<UserDTO> longExecutionTime() {
		System.out.println("Fallback...");
		List<UserDTO> userDTOList = new ArrayList<>();
		userDTOList.add(new UserDTO(1L, "fakeFistName", "fakeLastName", "fakeAddress"));
		return userDTOList;
	}
}
