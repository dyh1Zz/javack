package cn.sp.appinfo.service;

import cn.sp.appinfo.entity.DevUser;

public interface DevUserService {

	//�����ߵ�¼��֤����
	public DevUser login(String devCode,String devPassword);
}
