package com.imageupload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.imageupload.dto.UserDomain;
import com.imageupload.exception.ImageUloadExceptions.InvalidUserException;
import com.imageupload.models.UserModel;
import com.imageupload.repository.UserRepository;
@Service
class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public void setPasswordEncoder(BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserModel addUser(UserDomain userDomain) {
        UserModel existingUser = userRepository.findUserByuserName(userDomain.getUserName());
        if(existingUser != null && existingUser.getUserName().equalsIgnoreCase(userDomain.getUserName()) ) {
            throw new InvalidUserException("Username already exists.");
        }
        
        UserModel user1 = new UserModel();
        user1.setName(userDomain.getName());
        user1.setUserName(userDomain.getUserName());
        user1.setPassword(passwordEncoder.encode(userDomain.getPassword()));
        
        return userRepository.save(user1);
    }

    @Override
    public UserModel findUserByuserName(String userName) {
        
        return userRepository.findUserByuserName(userName);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        UserModel user = userRepository.findUserByuserName(username);
        if(user == null) {
            throw new UsernameNotFoundException("Invalid userName or Password!!");
        }
        return new User(user.getUserName(), user.getPassword(), null);
    }
     
}
