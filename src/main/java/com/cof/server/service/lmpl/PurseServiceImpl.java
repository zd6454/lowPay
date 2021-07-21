package com.cof.server.service.lmpl;

import com.cof.server.bean.Purse;
import com.cof.server.service.PurseService;

import java.util.List;

public class PurseServiceImpl implements PurseService {
    @Override
    public void updatePurseByuserId(Integer userId, Float balance) {

    }

    @Override
    public void updatePurseOfdel(Integer user_id, Float balance) {

    }

    @Override
    public void addPurse(Integer userId) {

    }

    @Override
    public Purse getPurseByUserId(Integer user_id) {
        return null;
    }

    @Override
    public void updatePurse(Purse purse) {

    }

    @Override
    public int getPurseNum() {
        return 0;
    }

    @Override
    public List<Purse> getPagePurse(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public List<Purse> getPagePurseByPurse(Integer userId, Integer state, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public Purse getPurseById(int id) {
        return null;
    }

    @Override
    public void updateByPrimaryKey(Integer id, Purse purse) {

    }

    @Override
    public void updatePursePassById(Integer id, Purse purse) {

    }

    @Override
    public void updatePurseRefuseById(Integer id, Purse purse) {

    }
}
