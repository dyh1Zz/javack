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

	//ǰ̨
	@Resource 
	private DevUserService devUserService;
	
	//��̨
	@Resource
	private BackendUserService backendUserService;
	
	//��ת�������ߵ�¼����
	@RequestMapping("/login")
	public String beforeLogin(){
		
		return "devlogin";
		
	}
	

	//��ת����̨�������
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
		model.addAttribute("error","�û�������������������µ�½!");
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
			model.addAttribute("error","�û�������������������µ�½!");
			return "backendlogin";
		}
		
	}

	
	
	//������ע��
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		//��sessionʧЧ
		session.invalidate();
		return "devlogin";	
	}
	//��̨ע��
	@RequestMapping("backLogout")
	public String backLogout(HttpSession session){
		session.invalidate();
		return "backendlogin";
	}
}
