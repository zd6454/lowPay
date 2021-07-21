package com.cof.server.service.lmpl;

import com.cof.server.bean.Focus;
import com.cof.server.service.FocusService;

import java.util.List;

public class FocusServiceImpl implements FocusService {
    @Override
    public List<Focus> getFocusByUserId(Integer user_id) {
        return null;
    }

    @Override
    public void deleteFocusByUserIdAndGoodsId(Integer goods_id, Integer user_id) {

    }

    @Override
    public void addFocusByUserIdAndId(Integer goods_id, Integer user_id) {

    }
}
