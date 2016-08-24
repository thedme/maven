package com.testten.dao;

import java.util.List;

import javax.ejb.Local;

import com.testten.BlogEntry;
import com.testten.dao.common.Dao;

@Local
public interface BlogEntryDao extends Dao<BlogEntry> {

	List<BlogEntry> find(int maxresults, int firstresult);

	Long count();

}
