package com.cof.server.dao;

import java.util.List;

import com.cof.server.bean.Image;

public interface ImageMapper {
    int deleteByPrimaryKey(Integer id);

    int deleteImagesByGoodsPrimaryKey(Integer goodsId);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKeyWithBLOBs(Image record);

    int updateByPrimaryKey(Image record);

    List<Image> selectByGoodsPrimaryKey(Integer goodsId);
}