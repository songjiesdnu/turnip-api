/**
 * 
 */
package com.robot.turnip.service;

import java.util.List;

import com.robot.turnip.domain.User;

/**
 * @author songjie
 *
 */
public interface IUserService {
//	public User getUserById(String userId);
	
	int deleteByPrimaryKey(String id);

    int insert(User record);

    User selectByPrimaryKey(String id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}

