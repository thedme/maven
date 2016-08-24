package com.testten.dao;

import javax.ejb.Local;

import com.testten.User;
import com.testten.dao.common.Dao;

@Local
public interface UserDao extends Dao<User> {

	User findByUsername(String username);

}
