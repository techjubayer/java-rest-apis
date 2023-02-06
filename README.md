## Create project from Spring Boot website

- https://start.spring.io/

### Add dependencies

- Spring Data MongoDB (in /pom.xml)
- Spring Web (in /pom.xml)

```
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

### Setup /application.properties

```
logging.level.org.springframework.context=DEBUG
spring.data.mongodb.uri=mongodb://localhost:27017
spring.data.mongodb.username=root
spring.data.mongodb.database=java-db
```

### Repo/UserRepo.java

```
package com.jubayer.restapi.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.User;

public interface UserRepo extends MongoRepository<User, String>{

}

```

### Repo/UserRepo.java

```
package com.jubayer.restapi.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jubayer.restapi.Repo.UserRepo;

import models.User;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class PostController {

	@Autowired
	UserRepo userRepo;

	@ApiIgnore
	@RequestMapping(value = "/")
	public void redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html");
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userRepo.save(user);
	}


	@GetMapping("/users")
	public List<User> getUser(){
		return userRepo.findAll();

	}
}

```

### models/User.java

```
package models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mongoCollection")
public class User {

	private String fname, lname, phone, email;
	private int age;


	public User() {

	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", email=" + email + ", age=" + age
				+ "]";
	}

}

```
