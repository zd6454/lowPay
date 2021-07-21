package com.cof.server.bean;

import java.util.List;

/**
 * 商品拓展，联合查询.
 * author huang
 */
public class NoticeExtend extends User {
    private List<Notice> notice;

    public List<Notice> getNotice() {
        return notice;
    }

    public void setNotice(List<Notice> notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "NoticeExtend [notice=" + notice + "]";
    }
}