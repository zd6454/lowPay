package com.cof.server.service;

import com.cof.server.bean.Focus;

import java.util.List;

public interface FocusService {
    /**
     * 根据用户的id，查询出该用户的所有闲置
     *
     * @param user_id
     * @return
     */
    public List<Focus> getFocusByUserId(Integer user_id);

    /**
     * 根据用户id和关注id删除我的关注
     *
     * @param goods_id
     * @param user_id 用户id
     */
    public void deleteFocusByUserIdAndGoodsId(Integer goods_id, Integer user_id);

    /**
     * 添加我的关注
     *
     * @param goods_id
     * @param user_id 用户id
     */
    public void addFocusByUserIdAndId(Integer goods_id, Integer user_id);
}
