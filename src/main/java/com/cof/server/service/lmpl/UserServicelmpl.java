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
    public void addUser(User user) {

    }

    @Override
    public User getUserByPhone(String phone) {
        return null;
    }

    @Override
    public void updateUserName(User user) {

    }

    @Override
    public int updateGoodsNum(Integer id, Integer goodsNum) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<User> getPageUser(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public int getUserNum() {
        return 0;
    }

    @Override
    public int getUserNum(String username) {
        return 0;
    }

    @Override
    public List<User> getPageUser(int pageNum, int pageSize, String username) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void deleteUserById(String idArr) {

    }

    @Override
    public List<User> getPageUserByUser(String phone, String username, String qq, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public List<User> getUserOrderByDate(int size) {
        return null;
    }
}
