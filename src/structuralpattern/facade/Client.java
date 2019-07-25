package structuralpattern.facade;

import structuralpattern.facade.subsystem.SubSystem1;
import structuralpattern.facade.subsystem.SubSystem2;
import structuralpattern.facade.facade.Facade;

/**
 * 客户端
 *
 * @author hui
 * @date 2019/7/23
 */
public class Client {
    public static void main(String[] args) {
        Facade facade=new SubSystem1();
        facade.gay();
        facade.xiong();

        facade=new SubSystem2();
        facade.gay();
        facade.xiong();
    }
}
