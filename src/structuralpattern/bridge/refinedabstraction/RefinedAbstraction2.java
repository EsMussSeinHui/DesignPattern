package structuralpattern.bridge.refinedabstraction;

import structuralpattern.bridge.abstraction.abstraction;
import structuralpattern.bridge.implementor.Implementor;

/**
 * 拓展抽象化角色2
 *
 * @author hui
 * @date 2019/7/22
 */
public class RefinedAbstraction2 implements abstraction {

    private Implementor implementor;

    public RefinedAbstraction2(Implementor implementor) {
        this.implementor = implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public void nowGay() {
        System.out.println("当前方案底层是2 ，调用的具体实现化角色");
        implementor.getXiong();
    }
}
