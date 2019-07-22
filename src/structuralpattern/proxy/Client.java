package structuralpattern.proxy;

import structuralpattern.proxy.proxy.LogHandler;
import structuralpattern.proxy.realSubject.RealSubject;
import structuralpattern.proxy.subject.Subject;

/**
 * Client class
 *
 * @author hui
 * @date 2019/7/22
 */
public class Client {
    public static  void main(String [] args){
        LogHandler logHandler=new LogHandler();
        //这里已经生成了代理类实例了
        Subject subject=(Subject)logHandler.newProxyInstance(new RealSubject());
        subject.addGay("1","gay");
        subject.addXiong("2","Xiong");
    }
}

//去代理实现的时候就可以加很多元素功能进去，再去执行目标method