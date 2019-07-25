package structuralpattern.bridge;

import structuralpattern.bridge.abstraction.abstraction;
import structuralpattern.bridge.concreteimplementor.ConcreteImplementor1;
import structuralpattern.bridge.concreteimplementor.ConcreteImplementor2;
import structuralpattern.bridge.implementor.Implementor;
import structuralpattern.bridge.refinedabstraction.RefinedAbstraction;

/**
 * 客户端
 *
 * @author hui
 * @date 2019/7/22
 */
public class Client {
    public static void main(String[] args) {
        Implementor imple=new ConcreteImplementor1();
        abstraction abs=new RefinedAbstraction(imple);
        abs.nowGay();


        Implementor imple2=new ConcreteImplementor2();
        abstraction abs2=new RefinedAbstraction(imple2);
        abs2.nowGay();

    }
}
