package com.imageupload.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDomain {

    private String name;
    
    private String userName;
    
    private String password;
}
