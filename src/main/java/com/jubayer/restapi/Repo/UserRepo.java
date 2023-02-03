package com.jubayer.restapi.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.User;

public interface UserRepo extends MongoRepository<User, String>{

}
