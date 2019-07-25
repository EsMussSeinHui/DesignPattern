package structuralpattern.facade.subsystem;

import structuralpattern.facade.facade.Facade;

/**
 * 子系统角色1
 *
 * @author hui
 * @date 2019/7/23
 */
public class SubSystem1 implements Facade {
    @Override
    public void xiong() {
        System.out.println("xiong1");
    }

    @Override
    public void gay() {
        System.out.println("gay1");
    }
}
