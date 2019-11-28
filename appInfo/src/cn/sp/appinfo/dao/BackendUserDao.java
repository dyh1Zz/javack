package cn.sp.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sp.appinfo.entity.BackendUser;
import cn.sp.appinfo.entity.DevUser;

public interface BackendUserDao {
	//根据用户名和密码获得信息
	public BackendUser getByBackendUserCodeAndBackendUseruserPassword(@Param("userCode") String userCode,@Param("userPassword") String userPassword);
}
