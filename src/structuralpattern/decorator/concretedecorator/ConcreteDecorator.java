package structuralpattern.decorator.concretedecorator;

import structuralpattern.decorator.componment.Component;
import structuralpattern.decorator.decorator.Decorator;

/**
 * 具体装饰
 *
 * @author hui
 * @date 2019/7/23
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operaGay() {
        super.operaGay();
        operaXiong();
    }


    public void operaXiong(){
        System.out.println("add decorator xiong");
    }
}
