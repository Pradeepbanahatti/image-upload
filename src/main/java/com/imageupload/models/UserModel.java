package com.imageupload.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class UserModel {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID", nullable = false)
    private Long userId;
    
    @Column(name = "NAME", nullable = false)
    @NotBlank(message = "Name cannot be blank")
    private String name;
    
    @Column(name = "USER_NAME", nullable = false, unique = true)
    @NotBlank(message = "Username cannot be blank")
    private String userName;
    
    @Column(name = "PASSWORD", nullable = false)
    @NotBlank(message = "Password cannot be blank")
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
//    @OneToMany
//    @JoinColumn(name = "fileId")
//    private List<FileDetails> fileDetails;
}
