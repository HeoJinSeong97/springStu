package com.heo.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heo.app.user.UserVO;
import com.heo.app.user.Impl.UserDAO;

public class LoginController implements Controller{
	@Override
	public String doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("�α��� ��Ʈ�ѷ�");
		String id=request.getParameter("id");
        String password=request.getParameter("password");

        UserVO vo = new UserVO();
        UserDAO dao = new UserDAO();
        
        vo.setId(id);
        vo.setPassword(password);

        UserVO data=dao.getUser(vo);

        if(data!=null){
        	return "getBoardList.do";
//       	 rd = request.getRequestDispatcher("/BoardList.do");
//	 		 rd.forward(request, response);
        }
        else{
        	return "login";
//       	response.sendRedirect("login.do");
//        	VS���� .do �� .jsp�� �ƴ϶�� �ڵ� �߰�
        }
		
	}
}
