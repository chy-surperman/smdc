package com.chy.smdc.service;

import com.chy.smdc.bean.User;


public interface UserService {


     User getUserByUsername(String username);


     User getUserRole(Integer id);

}
