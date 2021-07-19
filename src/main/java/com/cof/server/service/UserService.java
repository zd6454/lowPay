package com.cof.server.service;
import com.cof.server.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 64540
 */
@Service
public interface UserService {
    List<User> query();
}
