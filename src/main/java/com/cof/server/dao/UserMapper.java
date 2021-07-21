package com.cof.server.dao;

import com.cof.server.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import com.cof.server.bean.User;

/**
 * @author 64540
 */
@Component
public interface UserMapper {
    @Select("select  * from user")
    List<User> query();
}
//public interface UserMapper{
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(User record);
//
//    int insertSelective(User record);
//
//    User selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
//
//    User getUserByPhone(String phone);//通过手机号查询用户
//
//    int updateGoodsNum(@Param("id") Integer id, @Param("goodsNum") Integer goodsNum);//更改用户的商品数量
//
//    public List<User> getUserList();//获取所有用户
//
//    int findCount();
//
//    User getUserById(int id);
//
//    List<User> getUserListByUser(@Param("phone") String phone,@Param("username") String username,@Param("qq") String qq);
//
//    List<User> getUserListOrderByCreateAt();
//}