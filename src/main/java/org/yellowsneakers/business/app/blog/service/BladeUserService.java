package org.yellowsneakers.business.app.blog.service;

import java.util.List;
import java.util.Map;

import org.yellowsneakers.business.app.blog.model.BladeUser;

import com.baomidou.mybatisplus.extension.service.IService;

public interface BladeUserService extends IService<BladeUser> {

	List<Map<String, Object>> getUsers();

}
