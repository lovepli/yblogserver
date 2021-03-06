package com.xandone.yblog.service;

import com.xandone.yblog.common.BaseListResult;
import com.xandone.yblog.pojo.CommentBean;


/**
 * @author ：xandone
 * created on  ：2019/11/22 21:53
 * description：
 */
public interface CommentService {
    void addComment(CommentBean commentBean) throws Exception;

    BaseListResult getAllArtCommentById(Integer page, Integer row, String artId) throws Exception;

    int getAllCommentCount() throws Exception;
}
