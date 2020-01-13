package kr.ac.kopo.bookshop.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserInterceptor extends HandlerInterceptorAdapter {
	//미리 스프링에서 규정해 놓은 인터셉터를 상속받아서 우리가 할 일을 만든다
	//서블릿에서 어떤 때 인터셉터를 동작 시킬 것인가를 정해주어야한다
	@Override //preHandle은 리퀘스트를 실행하기 전에 가로채서 먼저 실행한다
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		//세션은 request에 자동으로 붙어서 온다
		//리퀘스트에서 세션을 가져온다
		
		if(session.getAttribute("user") == null) {
			//세션에 로그인이 되었는지 확인한다
			response.sendRedirect("/login");
			//로그인이 안되었으면 로그인 페이지로 가라고 한다
			// return redirect:list가 결과적으로 이것과 똑같은 일을 처리한다
			return false;
			//return false를 리턴하면 스프링이 인터셉터에서 문제가 있다하여 컨트롤러에 request를 보내지 않는다
		}
		
		return true;
		//세션에 로그인이 되어 있으면 정상적으로 리퀘스트를 실행시킨다
	}
	
}
