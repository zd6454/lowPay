package com.cof.server.service;

import com.cof.server.bean.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> getNoticeList();

    public void insertSelective(Notice notice);
}
