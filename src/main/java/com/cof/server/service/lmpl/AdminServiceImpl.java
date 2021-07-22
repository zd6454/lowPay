package com.cof.server.service.lmpl;

import com.cof.server.bean.Admin;
import com.cof.server.dao.AdminMapper;
import com.cof.server.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value="adminService")
public class AdminServiceImpl implements AdminService {


    @Resource
    @Autowired
    private AdminMapper am;

    @Override
    public Admin findAdmin(Long phone, String password) {
        // TODO Auto-generated method stub
        return am.findAdmin(phone,password);
    }

    @Override
    public Admin findAdminById(Integer id) {
        // TODO Auto-generated method stub
        return am.findAdminById(id);
    }

    @Override
    public void updateAdmin(Admin admins) {
        am.updateAdmin(admins);
    }

}
