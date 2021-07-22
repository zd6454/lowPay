package com.cof.server.service.lmpl;

import com.cof.server.bean.CommentExtend;
import com.cof.server.bean.Comments;
import com.cof.server.bean.Goods;
import com.cof.server.dao.GoodsMapper;
import com.cof.server.service.GoodsService;
import com.cof.server.utils.DateUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public int addGood(Goods goods , Integer duration) {
        String startTime = DateUtil.getNowDay();
        String endTime = DateUtil.getLastTime(startTime, duration);
        String polishTime = startTime;
        //添加上架时间，下架时间，擦亮时间
        goods.setPolishTime(polishTime);
        goods.setEndTime(endTime);
        goods.setStartTime(startTime);
        return goodsMapper.insert(goods);
    }

    @Override
    public Goods getGoodsByPrimaryKey(Integer goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        return goods;
    }

    @Override
    public Goods getGoodsById(Integer goodsId) {
        Goods goods = goodsMapper.selectById(goodsId);
        return goods;
    }

    @Override
    public void deleteGoodsByPrimaryKey(Integer id) {
        goodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteGoodsByPrimaryKeys(Integer id) {
        goodsMapper.deleteByPrimaryKeys(id);
    }

    @Override
    public List<Goods> getAllGoods() {
        List<Goods> goods = goodsMapper.selectAllGoods();
        return goods;
    }

    @Override
    public List<Goods> searchGoods(String name, String describle) {
        List<Goods> goods = goodsMapper.searchGoods(name,describle);
        return  goods;
    }

    @Override
    public List<Goods> getGoodsByStr(Integer limit, String name, String describle) {
        List<Goods> goods = goodsMapper.selectByStr(limit, name, describle);
        return goods;
    }

    @Override
    public List<Goods> getGoodsByCatelog(Integer id, String name, String describle) {
        List<Goods> goods = goodsMapper.selectByCatelog(id,name,describle);
        return goods;
    }

    @Override
    public void updateGoodsByPrimaryKeyWithBLOBs(int goodsId, Goods goods) {
        goods.setId(goodsId);
        this.goodsMapper.updateByPrimaryKeyWithBLOBs(goods);
    }

    @Override
    public List<Goods> getGoodsByCatelogOrderByDate(Integer catelogId, Integer limit) {
        List<Goods> goodsList = goodsMapper.selectByCatelogOrderByDate(catelogId , limit);
        return goodsList;
    }

    @Override
    public List<Goods> getGoodsOrderByDate(Integer limit) {
        List<Goods> goodsList = goodsMapper.selectOrderByDate(limit);
        return goodsList;
    }

    @Override
    public List<Goods> getGoodsByUserId(Integer user_id) {
        List<Goods> goodsList = goodsMapper.getGoodsByUserId(user_id);
        return goodsList;
    }

    @Override
    public void updateGoodsByGoodsId(Goods goods) {

        goodsMapper.updateGoodsByGoodsId(goods);

    }

    @Override
    public int getGoodsNum() {
        //获取出商品的数量
        List<Goods> goods = goodsMapper.getGoodsList();
        return goods.size();
    }

    @Override
    public List<Goods> getPageGoods(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> list =goodsMapper.getGoodsList();
        return list;
    }

    @Override
    public List<Goods> getPageGoodsByGoods(Integer id,String name,Integer status, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> list =goodsMapper.getPageGoodsByGoods(id,name,status);
        return list;
    }

    @Override
    public CommentExtend selectCommentsByGoodsId(Integer id) {
        return goodsMapper.selectCommentsByGoodsId(id);
    }

    @Override
    public void addComments(Comments comments) {
        goodsMapper.addComments(comments);
    }
}
