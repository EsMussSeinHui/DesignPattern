package structuralpattern.bridge.refinedabstraction;

import structuralpattern.bridge.abstraction.abstraction;
import structuralpattern.bridge.implementor.Implementor;

/**
 * 拓展抽象化角色 1    可以有多个。代表不同底层
 *
 * @author hui
 * @date 2019/7/22
 */
public class RefinedAbstraction implements abstraction {

    private Implementor implementor;

    public RefinedAbstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }


    @Override
    public void nowGay() {
        System.out.println("当前方案底层是1 ，调用的具体实现化角色");
        implementor.getXiong();
    }
}
