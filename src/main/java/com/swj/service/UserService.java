package com.swj.service;

import com.swj.po.User;
import org.springframework.stereotype.Component;
@Component
public interface UserService {
    User checkUser(String username, String password);
}
