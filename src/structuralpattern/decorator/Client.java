package structuralpattern.decorator;

import structuralpattern.decorator.componment.Component;
import structuralpattern.decorator.concretecomponent.ConcreteComponent;
import structuralpattern.decorator.concretedecorator.ConcreteDecorator;
import structuralpattern.decorator.decorator.Decorator;

/**
 * 客户端
 *
 * @author hui
 * @date 2019/7/23
 */
public class Client {
    public static void main(String[] args) {
        Component component=new ConcreteComponent();
        component.operaGay();
        System.out.println();
        //Decorator decorator=new ConcreteDecorator(component);
        Component decorator=new ConcreteDecorator(component);

        decorator.operaGay();
    }
}
