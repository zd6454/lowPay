package com.cof.server.service;

import com.cof.server.bean.Admin;

public interface AdminService {
    public Admin findAdmin(Long phone, String password);

    public Admin findAdminById(Integer id);

    public void updateAdmin(Admin admins);
}