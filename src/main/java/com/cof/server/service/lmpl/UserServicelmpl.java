package com.cof.server.service.lmpl;
import com.cof.server.bean.User;
import com.cof.server.dao.UserMapper;
import com.cof.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author 64540
 */
@Service
public class UserServicelmpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> query() {
        //调用UserMapper中的query方法，返回一个List，类型为User，为了代码简洁，就不需要定义中间变量。
        //如：List<User> user = userMapper.query();
        //    return user;
        return userMapper.query();
    }
}
