package com.cof.server.service.lmpl;

import com.cof.server.bean.Notice;
import com.cof.server.service.NoticeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Override
    public List<Notice> getNoticeList() {
        return null;
    }

    @Override
    public void insertSelective(Notice notice) {

    }
}
