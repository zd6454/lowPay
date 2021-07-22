package com.cof.server.service.lmpl;

import com.cof.server.bean.Focus;
import com.cof.server.dao.FocusMapper;
import com.cof.server.service.FocusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("focusService")
public class FocusServiceImpl implements FocusService {

    @Resource
    private FocusMapper focusMapper;

    /**
     * 根据用户id获取我的关注
     */
    @Override
    public List<Focus> getFocusByUserId(Integer user_id) {
        List<Focus> focusList = focusMapper.getFocusByUserId(user_id);

        return focusList;
    }

    /*
     * 根据用户id和关注id删除
     */

    @Override
    public void deleteFocusByUserIdAndGoodsId(Integer goods_id, Integer user_id) {

        focusMapper.deleteFocusByUserIdAndGoodsId(goods_id, user_id);

    }
    /*
     * 添加我的关注
     */
    @Override
    public void addFocusByUserIdAndId(Integer goods_id, Integer user_id) {
        System.out.println("在service里面的goods——id："+goods_id);

        focusMapper.addFocusByUserIdAndGoodsId(goods_id,user_id);

    }

}
