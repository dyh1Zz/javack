package cn.sp.appinfo.service;

import cn.sp.appinfo.entity.DevUser;

public interface DevUserService {

	//开发者登录验证方法
	public DevUser login(String devCode,String devPassword);
}
