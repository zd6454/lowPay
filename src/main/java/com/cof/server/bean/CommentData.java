package com.cof.server.bean;

public class CommentData extends Goods{
    private List<Comments> comments;
    public List<Comments> getComments() {
        return comments;
    }
    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}