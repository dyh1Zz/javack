package cn.sp.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sp.appinfo.entity.DevUser;

public interface DevUserDao {

	//�����û����������ÿ�������Ϣ
	public DevUser getByDevCodeAndDevPassword(@Param("devCode") String devCode,@Param("devPassword") String devPassword);
	
}
