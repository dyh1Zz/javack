package cn.sp.appinfo.service;

import cn.sp.appinfo.entity.BackendUser;
import cn.sp.appinfo.entity.DevUser;

public interface BackendUserService {

	//验证登陆方法
	public BackendUser login(String userCode,String userPassword);
	


}
