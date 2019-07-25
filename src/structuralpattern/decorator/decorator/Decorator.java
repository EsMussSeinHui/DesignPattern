package structuralpattern.decorator.decorator;

import structuralpattern.decorator.componment.Component;

/**
 * 抽象装饰
 *
 * @author hui
 * @date 2019/7/23
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operaGay() {
        component.operaGay();
    }
}
