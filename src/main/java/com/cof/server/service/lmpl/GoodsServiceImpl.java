package com.cof.server.service.lmpl;

import com.cof.server.bean.CommentExtend;
import com.cof.server.bean.Comments;
import com.cof.server.bean.Goods;
import com.cof.server.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Override
    public int addGood(Goods goods, Integer duration) {
        return 0;
    }

    @Override
    public Goods getGoodsByPrimaryKey(Integer goodsId) {
        return null;
    }

    @Override
    public Goods getGoodsById(Integer goodsId) {
        return null;
    }

    @Override
    public void updateGoodsByPrimaryKeyWithBLOBs(int goodsId, Goods goods) {

    }

    @Override
    public void deleteGoodsByPrimaryKey(Integer id) {

    }

    @Override
    public void deleteGoodsByPrimaryKeys(Integer id) {

    }

    @Override
    public List<Goods> getAllGoods() {
        return null;
    }

    @Override
    public List<Goods> searchGoods(String name, String describle) {
        return null;
    }

    @Override
    public List<Goods> getGoodsByStr(Integer limit, String name, String describle) {
        return null;
    }

    @Override
    public List<Goods> getGoodsByCatelog(Integer id, String name, String describle) {
        return null;
    }

    @Override
    public List<Goods> getGoodsOrderByDate(Integer limit) {
        return null;
    }

    @Override
    public List<Goods> getGoodsByCatelogOrderByDate(Integer catelogId, Integer limit) {
        return null;
    }

    @Override
    public List<Goods> getGoodsByUserId(Integer user_id) {
        return null;
    }

    @Override
    public void updateGoodsByGoodsId(Goods goods) {

    }

    @Override
    public int getGoodsNum() {
        return 0;
    }

    @Override
    public List<Goods> getPageGoods(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public List<Goods> getPageGoodsByGoods(Integer id, String name, Integer status, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public CommentExtend selectCommentsByGoodsId(Integer id) {
        return null;
    }

    @Override
    public void addComments(Comments comments) {

    }
}
