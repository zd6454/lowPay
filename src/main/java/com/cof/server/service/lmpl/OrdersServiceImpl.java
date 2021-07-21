package com.cof.server.service.lmpl;

import com.cof.server.bean.Orders;
import com.cof.server.service.OrdersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Override
    public List<Orders> getOrdersByUserId(Integer user_id) {
        return null;
    }

    @Override
    public List<Orders> getOrdersByUserAndGoods(Integer user_id) {
        return null;
    }

    @Override
    public void addOrders(Orders orders) {

    }

    @Override
    public void deliverByOrderNum(Integer orderNum) {

    }

    @Override
    public void receiptByOrderNum(Integer orderNum) {

    }

    @Override
    public int getOrdersNum() {
        return 0;
    }

    @Override
    public List<Orders> getPageOrders(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public Orders getOrdersById(int ordersId) {
        return null;
    }

    @Override
    public void updateByPrimaryKey(Integer id, Orders orders) {

    }

    @Override
    public void deleteOrdersByPrimaryKeys(int parseInt) {

    }

    @Override
    public List<Orders> getPageOrdersByOrders(Long orderNum, String orderInformation, Integer orderState, int pageNum, int pageSize) {
        return null;
    }
}
