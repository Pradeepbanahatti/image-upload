package com.imageupload.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.imageupload.dto.UserDomain;
import com.imageupload.exception.ImageUloadExceptions.InvalidUserException;
import com.imageupload.models.UserModel;
public interface UserService extends UserDetailsService {

    public UserModel addUser(UserDomain userDomain) throws InvalidUserException;
    
    public UserModel findUserByuserName(String userName);
}
