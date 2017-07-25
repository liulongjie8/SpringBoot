package com.lls.springboot.iterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lls.springboot.bean.User;
import com.lls.springboot.exception.GlobalErrorInfoEnum;
import com.lls.springboot.exception.GlobalErrorInfoException;
import com.lls.springboot.service.UserService;
import com.mysql.jdbc.StringUtils;

/**
 * 权限认证拦截器
 * 
 * @author LLS
 * 
 */
@Component
public class AccessTokenVerifyInterceptor implements HandlerInterceptor {

	@Autowired
	private ValidationService service;

	@Autowired
	private UserService userService;

	// 第一步：从request获取token

	// 第二步：根据token获取校验对象信息（也可以加入过期时间校验，简单）

	// 第三步：通过校验信息获取用户信息
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		boolean flag = false;

		try {
			String accessToken = request.getParameter("token");
			if (StringUtils.isNullOrEmpty(accessToken)) {
				ValidationModel v = service.verifyAccessToken(accessToken);
				if (v != null) {
					User user = userService.findById(v.getUid());
					if (user != null) {
						request.setAttribute("User", user);
						flag = true;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new GlobalErrorInfoException(GlobalErrorInfoEnum.NOT_FOUND);
		}
		return flag;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

	}

}
