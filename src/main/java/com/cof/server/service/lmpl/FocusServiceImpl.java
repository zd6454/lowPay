package com.cof.server.service.lmpl;

import com.cof.server.bean.Focus;
import com.cof.server.service.FocusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
