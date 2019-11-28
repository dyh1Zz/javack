package cn.sp.appinfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sp.appinfo.dao.BackendUserDao;
import cn.sp.appinfo.entity.BackendUser;

import cn.sp.appinfo.service.BackendUserService;
@Service
public class BackendUserSerivceImpl implements BackendUserService{

	@Resource
	private BackendUserDao backendUserDao;
	
	@Override
	public BackendUser login(String userCode, String userPassword) {
	
		return backendUserDao.getByBackendUserCodeAndBackendUseruserPassword(userCode, userPassword);
	}

}
