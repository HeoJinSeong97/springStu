package com.kim.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.kim.app.users.UsersService;
import com.kim.app.users.UsersVO;


@Controller
public class UserController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/insertUser.do")
	public String insertUser(UsersVO vo,Model m) {
		System.out.println("insertUser");
		
		usersService.insertUsers(vo);
		
		vo=usersService.getUsers(vo);
		
		m.addAttribute("v", vo);
		
		return "getUser.jsp";
	}
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(UsersVO vo,HttpSession session) {
		System.out.println("login");
		
		if(vo.getId()==null || vo.getId().equals("")) {			
			System.out.println(vo);
			System.out.println("예외처리이동");
			throw new IllegalArgumentException("사용자가 없음");
		}

		UsersVO data=usersService.getUsers(vo);
		
		if(data!=null){
			session.setAttribute("userName", data.getName());
			System.out.println("boardList이동"+vo);
			return "redirect:getBoardList.do";
		}
		else {
			return "login.jsp";
		}
	}
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public String login2(@ModelAttribute("user")UsersVO vo) {
		System.out.println("get = login");
		
		vo.setId("a");
		vo.setPassword("a");
		
		return "login.jsp";
	}
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("logout");

		session.invalidate();

		return "login.jsp";
	}
}
