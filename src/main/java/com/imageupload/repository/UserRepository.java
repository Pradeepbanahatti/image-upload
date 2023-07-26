package com.imageupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imageupload.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {

    public UserModel findUserByuserName(String userName);
    
}
