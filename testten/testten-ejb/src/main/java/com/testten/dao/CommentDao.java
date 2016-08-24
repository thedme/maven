package com.testten.dao;

import java.util.List;

import javax.ejb.Local;

import com.testten.BlogEntry;
import com.testten.Comment;
import com.testten.dao.common.Dao;

@Local
public interface CommentDao extends Dao<Comment> {

	List<Comment> findComments(BlogEntry blogEntry);

}
