/**
 * 
 */
package cn.travelsky.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.travelsky.ssm.mapper.UserMapper;
import cn.travelsky.ssm.pojo.pojo;
import cn.travelsky.ssm.service.UserService;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public void insert(pojo pojo) {
		userMapper.insertUser(pojo);
		System.out.println("还差dao"+pojo);
		
	}

}
