package structuralpattern.facade.subsystem;

import structuralpattern.facade.facade.Facade;

/**
 * 子系统角色2
 *
 * @author hui
 * @date 2019/7/23
 */
public class SubSystem2 implements Facade {
    @Override
    public void xiong() {
        System.out.println("xiong2");
    }

    @Override
    public void gay() {
        System.out.println("gay2");
    }
}
