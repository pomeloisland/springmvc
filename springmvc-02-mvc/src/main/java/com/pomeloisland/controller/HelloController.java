package com.pomeloisland.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        //业务代码
        String result = "HelloSpringMVC";
        mv.addObject("msg",result);
        mv.setViewName("hello");

        // //封装对象，放在ModelAndView中。Model
        // mv.addObject("msg","HelloSpringMVC1!，我是成博");
        // //封装要跳转的视图，放在ModelAndView中
        // mv.setViewName("hello"); //: /WEB-INF/jsp/hello.jsp
        return mv;

    }
}
