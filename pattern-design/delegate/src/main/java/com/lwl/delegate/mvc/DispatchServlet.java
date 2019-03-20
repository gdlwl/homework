package com.lwl.delegate.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DispatchServlet extends HttpServlet {
    private List<Handler> handlerMapping = new ArrayList<Handler>();
    @Override
    public void init() throws ServletException {
        Class<?> clazz = MemberController.class;
        Class<?> orderClass = OrderController.class;
        try {
            handlerMapping.add(new Handler().initHandler(clazz.newInstance(),
                    clazz.getMethod("getMemberById", String.class),"/web/getMemberById.json"));

            handlerMapping.add(new Handler().initHandler(orderClass.newInstance(),
                    orderClass.getMethod("getMemberById", String.class),"/web/getOrderById.json"));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private void doDispatch(HttpServletRequest request, HttpServletResponse response){
        //1、获取用户请求的url
        //   如果按照J2EE的标准、每个url对对应一个Serlvet，url由浏览器输入
        String uri = request.getRequestURI();

        //2、Servlet拿到url以后，要做权衡（要做判断，要做选择）
        //   根据用户请求的URL，去找到这个url对应的某一个java类的方法

        //3、通过拿到的URL去handlerMapping（我们把它认为是策略常量）
        Handler handle = null;
        for (Handler h: handlerMapping) {
            if(uri.equals(h.getUrl())){
                handle = h;
                break;
            }
        }

        Object object = null;
        try {
            //4、将具体的任务分发给Method（通过反射去调用其对应的方法）
            object = handle.getMethod().invoke(handle.getController(),request.getParameter("menberId"));
            //5、获取到Method执行的结果，通过Response返回出去
            response.getWriter().write(object.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class Handler{
    private Object controller;
    private Method method;
    private String url;

    public Object getController() {
        return controller;
    }

    public void setController(Object controller) {
        this.controller = controller;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public Handler initHandler(Object controller,Method method,String url){
        this.setController(controller);
        this.setMethod(method);
        this.setUrl(url);
        return this;
    }
}