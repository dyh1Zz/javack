package cn.sp.appinfo.service;

import cn.sp.appinfo.entity.BackendUser;
import cn.sp.appinfo.entity.DevUser;

public interface BackendUserService {

	//��֤��½����
	public BackendUser login(String userCode,String userPassword);
	


}
