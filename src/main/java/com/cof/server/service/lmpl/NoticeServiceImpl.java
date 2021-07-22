package com.cof.server.service.lmpl;

import com.cof.server.bean.Notice;
import com.cof.server.dao.NoticeMapper;
import com.cof.server.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("NoticeService")
public class NoticeServiceImpl implements NoticeService{
    @Resource
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> getNoticeList() {

        return noticeMapper.getNoticeList();
    }

    @Override
    public void insertSelective(Notice notice) {
        noticeMapper.insertSelective(notice);

    }




}