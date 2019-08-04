package com.lu.j1993.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  preHandle在业务处理器处理请求之前被调用，
    postHandle在业务处理器处理请求执行完成后,生成视图之前执行
    afterCompletion在DispatcherServlet完全处理完请求后被调用
 * Created by Administrator on 2019/8/5.
 */
@Component
public class CommonInterceptor extends HandlerInterceptorAdapter {
    Logger logger=LoggerFactory.getLogger(CommonInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       logger.info("请求ip:"+request.getRemoteAddr());
       logger.info("请求的方法"+request.getMethod());
//        ModelMap modelMap = modelAndView.getModelMap();
//        modelMap.addAttribute("title","lucien");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
