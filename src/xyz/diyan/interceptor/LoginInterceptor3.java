package xyz.diyan.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor3 implements HandlerInterceptor
{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2) throws Exception
	{
		Object obj = req.getSession().getAttribute("sysAdmin");
		if(obj!=null)
		{
			System.out.println("sysadmin放行了。。。。。");
			return true;
		}
		else
		{
			System.out.println("sysadmin不放行。。。。。");
			resp.sendRedirect(req.getContextPath()+"/index");
		}
		return false;
	}

}
