package xyz.diyan.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.diyan.pojo.Admin;
import xyz.diyan.pojo.SysAdmin;
import xyz.diyan.pojo.Users;
import xyz.diyan.service.AdminService;
import xyz.diyan.service.BooksService;
import xyz.diyan.service.SysAdminService;

 

@Controller
public class PageController
{
	@Autowired
	private BooksService bookService;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private SysAdminService sysAdminService;
	
	@RequestMapping("/index")
	public String toIndex()
	{
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(Users user,int loginType,Model model,HttpSession session)
	{
		//普通用户
		if(loginType==1)
		{
			Users users = bookService.selectUser(user);
			if(users!=null)
			{
				session.setAttribute("user", users);
				return "redirect:/user/index";
			}
			else{
				model.addAttribute("msg", "账号或密码错误");
				return "login";
			}
		}
		else if(loginType==2)
		{
			Admin admin = adminService.getAdmin(user);
			if(admin!=null)
			{
				session.setAttribute("admin", admin);
				return "redirect:/admin/index";
			}
			else{
				model.addAttribute("msg", "账号或密码错误");
				return "login";
			}
		}	
		else if(loginType==3)
		{
			SysAdmin sysAdmin = sysAdminService.getSysAdmin(user);
			if(sysAdmin!=null)
			{
				session.setAttribute("sysAdmin", sysAdmin);
				return "redirect:/sysadmin/index";
			}
			else{
				model.addAttribute("msg", "账号或密码错误");
				return "login";
			}
		}
		return "login";
	}
}
