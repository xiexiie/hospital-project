package com.lb.interceptor;

import com.lb.entity.LbUser;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description 自定义登录拦截器
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        LbUser user = (LbUser) session.getAttribute("user");
        if (user == null) {//重定向到登录视图
            response.sendRedirect(request.getContextPath() + "/home/user/loginRegisterPage");
            return false;
        }
        return true;
    }
}
