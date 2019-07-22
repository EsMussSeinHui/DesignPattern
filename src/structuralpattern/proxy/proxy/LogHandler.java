package structuralpattern.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * LogHandler　class
 *
 * @author hui
 * @date 2019/7/22
 */

//1、动态代理类只能代理接口，不支持抽象类？
//2、需要实现InvocationHandle 接口，
public class LogHandler implements InvocationHandler {
    //目标对象
    private Object targetObject;


    //绑定关系,生成代理对象
    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start-->>");
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        Object ret=null;
        try{
            System.out.println("start-->>");
            //调用目标方法
            //method？？？
            ret=method.invoke(targetObject, args);
            /*原对象方法调用后处理日志信息*/
            System.out.println("success-->>");
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("error-->>");
            throw e;
        }

        return ret;
    }
}
