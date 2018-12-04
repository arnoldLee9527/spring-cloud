package com.lee.filterConfig;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Component
public class LoginFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取zuul的上下文对象
        RequestContext currentContext = RequestContext.getCurrentContext();
        //从上下文对象中获取请求对象
        HttpServletRequest request = currentContext.getRequest();
        //从请求对象中获取参数
        String parameter = request.getParameter("name");
        //对参数进行判断
        if (StringUtils.isEmpty(parameter)){
            //名字为空则判断未登录
            //设置响应
            currentContext.setSendZuulResponse(false);
            //设置状态码
            currentContext.setResponseStatusCode(401);
        }

        return null;
    }
}
