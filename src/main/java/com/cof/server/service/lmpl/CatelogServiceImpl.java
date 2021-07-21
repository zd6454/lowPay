package com.cof.server.service.lmpl;

import com.cof.server.bean.Catelog;
import com.cof.server.service.CatelogService;

import java.util.List;

public class CatelogServiceImpl implements CatelogService {
    @Override
    public List<Catelog> getAllCatelog() {
        return null;
    }

    @Override
    public int getCount(Catelog catelog) {
        return 0;
    }

    @Override
    public Catelog selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Catelog record) {
        return 0;
    }

    @Override
    public int updateCatelogNum(Integer id, Integer number) {
        return 0;
    }
}
