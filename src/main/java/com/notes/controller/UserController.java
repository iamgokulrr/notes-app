package com.notes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notes.dto.UserRequestDTO;
import com.notes.dto.UserResponseDTO;
import com.notes.entity.User;
import com.notes.mapper.userMapper;
import com.notes.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private userMapper userMapper;
	
	@PostMapping
	public ResponseEntity<UserResponseDTO> createuser(@RequestBody UserRequestDTO userRequestDTO) {

		User user = userMapper.toEntity(userRequestDTO);
		User savedUser = userService.createUser(user);

		UserResponseDTO responseDTO = userMapper.toResponseDTO(savedUser);

		return new ResponseEntity<UserResponseDTO>(responseDTO, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> findAllUsers(){
		List<User> listOfusers=userService.findAllUsers();		
		return new ResponseEntity<List<User>>(listOfusers, HttpStatus.CREATED);				
	}	
}
