package com.cof.server.dao;

import com.cof.server.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 64540
 */
@Component
public interface UserMapper {
    @Select("select  * from user")
    List<User> query();
}
