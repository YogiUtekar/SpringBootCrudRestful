package org.company.sbcrudrestful.controller;

import java.util.List;
import java.util.Optional;

import org.company.sbcrudrestful.dao.UserDAOInt;
import org.company.sbcrudrestful.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRESTController {

	@Autowired
	private UserDAOInt userDAOInt;

	@GetMapping("/")
	public String welcome() {
		return "Welcome to RestTemplate Example.";
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userDAOInt.findAll();
	}

	@GetMapping("/users/{user_Id}")
	public ResponseEntity<Optional<User>> getUserbyID(@PathVariable(value = "user_Id") Long user_Id) {
		Optional<User> user = userDAOInt.findById(user_Id);
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userDAOInt.save(user);
    }
	
}