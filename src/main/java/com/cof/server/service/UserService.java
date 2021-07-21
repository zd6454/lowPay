package com.cof.server.service;

import com.cof.server.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 64540
 */
@Service
public interface UserService {
    public void addUser(User user);

    public User getUserByPhone(String phone);

    public void updateUserName(User user);

    int updateGoodsNum(Integer id, Integer goodsNum);

    User selectByPrimaryKey(Integer id);

    public List<User> getPageUser(int pageNum, int pageSize);

    public int getUserNum();

    public int getUserNum(String username);

    public List<User> getPageUser(int pageNum, int pageSize, String username);

    public User getUserById(int id);

    public void deleteUserById(String idArr);

    public List<User> getPageUserByUser(String phone, String username, String qq, int pageNum, int pageSize);

    public List<User> getUserOrderByDate(int size);

    public List<User> getUserList();
}
