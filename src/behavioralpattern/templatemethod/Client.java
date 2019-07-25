package behavioralpattern.templatemethod;

import behavioralpattern.templatemethod.abstractclass.AbstractClass;
import behavioralpattern.templatemethod.concreteclass.ConcreteClass;

/**
 * 客户端
 *
 * @author hui
 * @date 2019/7/24
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass=new ConcreteClass();
        abstractClass.templateMethod();
    }
}
