package cn.sp.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sp.appinfo.entity.BackendUser;
import cn.sp.appinfo.entity.DevUser;

public interface BackendUserDao {
	//�����û�������������Ϣ
	public BackendUser getByBackendUserCodeAndBackendUseruserPassword(@Param("userCode") String userCode,@Param("userPassword") String userPassword);
}
