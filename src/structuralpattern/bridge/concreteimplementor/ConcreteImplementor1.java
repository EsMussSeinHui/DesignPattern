package structuralpattern.bridge.concreteimplementor;

import structuralpattern.bridge.implementor.Implementor;

/**
 * 具体实现化角色，给出是实现化角色接口的具体实现
 *
 * @author hui
 * @date 2019/7/22
 */
public class ConcreteImplementor1 implements Implementor {
    @Override
    public void getXiong() {
        System.out.println("xiong1");
    }
}
