package behavioralpattern.templatemethod.concreteclass;

import behavioralpattern.templatemethod.abstractclass.AbstractClass;

/**
 * ConcreteClass 具体子类
 *
 * @author hui
 * @date 2019/7/24
 */
public class ConcreteClass extends AbstractClass {
    /**
     * 这边其实是模拟算法的特殊步骤
     */
    @Override
    public void abstractMethod() {
        System.out.println("算法某些特定步骤");
    }
}
