package com.cof.server.bean;

/**
 * 商品联合查询.
 *
 * @author huang
 */

import java.util.List;

public class CommentData extends Goods {
    private List<Comments> comments;

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}