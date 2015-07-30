/**
 * Date:2015年7月30日下午11:07:33
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package com.robot.turnip.service;

import java.util.List;

import com.robot.turnip.domain.UserProfile;

/**
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2015年7月30日 下午11:07:33 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 */
public interface IUserProfileService {
	int deleteByPrimaryKey(String id);

    int insert(UserProfile record);

    UserProfile selectByPrimaryKey(String id);

    List<UserProfile> selectAll();

    int updateByPrimaryKey(UserProfile record);
}

