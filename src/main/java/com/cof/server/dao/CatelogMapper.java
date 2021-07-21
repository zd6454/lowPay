package com.cof.server.dao;

import com.cof.server.bean.Catelog;
import org.apache.ibatis.annotations.Param;
import com.cof.server.bean.Catelog;
import java.util.List;

public interface CatelogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Catelog record);

    int insertSelective(Catelog record);

    Catelog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Catelog record);

    int updateByPrimaryKey(Catelog record);

    int updateCatelogNum(@Param("id") Integer id,@Param("number") Integer number);

    /**
     * 根据商品类别查询商品.
     * @return 商品列表
     */
    List<Catelog> getAllCatelog();

    int getCount(Catelog catelog);
}