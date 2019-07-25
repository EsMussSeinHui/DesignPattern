package structuralpattern.decorator.concretecomponent;

import structuralpattern.decorator.componment.Component;

/**
 * 具体构件
 *
 * @author hui
 * @date 2019/7/23
 */
public class ConcreteComponent implements Component {
    @Override
    public void operaGay() {
        System.out.println("gay");
    }
}
