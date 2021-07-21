package com.cof.server.service.lmpl;

import com.cof.server.bean.Image;
import com.cof.server.service.ImageService;

import java.util.List;

public class ImageServiceImpl implements ImageService {
    @Override
    public int insert(Image record) {
        return 0;
    }

    @Override
    public List<Image> getImagesByGoodsPrimaryKey(Integer goodsId) {
        return null;
    }

    @Override
    public int deleteImagesByGoodsPrimaryKey(Integer goodsId) {
        return 0;
    }
}
