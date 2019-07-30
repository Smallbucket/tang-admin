package org.yellowsneakers.business.app.blog.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.yellowsneakers.business.app.blog.mapper.BladeUserMapper;
import org.yellowsneakers.business.app.blog.model.BladeUser;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class BladeUserServiceImpl extends ServiceImpl<BladeUserMapper, BladeUser> implements BladeUserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	@DS("ams")
	public List<Map<String, Object>> getUsers() {
		List<Map<String, Object>> users = jdbcTemplate.queryForList("select name from blade_user");
		System.out.println(users);
		return users;
	}

}
