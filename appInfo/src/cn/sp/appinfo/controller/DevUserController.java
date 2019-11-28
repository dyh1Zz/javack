package cn.sp.appinfo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sp.appinfo.entity.BackendUser;
import cn.sp.appinfo.entity.DevUser;
import cn.sp.appinfo.service.BackendUserService;
import cn.sp.appinfo.service.DevUserService;

@Controller
@RequestMapping("/dev")
public class DevUserController {

	//前台
	@Resource 
	private DevUserService devUserService;
	
	//后台
	@Resource
	private BackendUserService backendUserService;
	
	//跳转到开发者登录界面
	@RequestMapping("/login")
	public String beforeLogin(){
		
		return "devlogin";
		
	}
	

	//跳转到后台管理界面
	@RequestMapping("/backendLogin")
	public String backendLogin(){
		
		return "backendlogin";
	}
	
	@RequestMapping("/beforeLogin")					 
	public String beforeLogin(String devCode,String devPassword ,HttpSession session, Model model){
		DevUser devUser = devUserService.login(devCode, devPassword);
		
		
		if(devUser !=null){
			session.setAttribute("devUserSession", devUser);
		
			return "developer/main";
		}else{
		model.addAttribute("error","用户名或者密码错误，请重新登陆!");
			return "devlogin";
		}		
	}
	
	
	@RequestMapping("/backLogin")
	public String backLogin (String userCode, String userPassword,  HttpSession session, Model model){
		BackendUser backUser = backendUserService.login(userCode, userPassword);
		if(backUser !=null){
			session.setAttribute("userSession", backUser);
			session.setAttribute("userName",backUser.getUserName());
			return "backend/main";
		}else{
			model.addAttribute("error","用户名或者密码错误，请重新登陆!");
			return "backendlogin";
		}
		
	}

	
	
	//开发者注销
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		//让session失效
		session.invalidate();
		return "devlogin";	
	}
	//后台注销
	@RequestMapping("backLogout")
	public String backLogout(HttpSession session){
		session.invalidate();
		return "backendlogin";
	}
}
