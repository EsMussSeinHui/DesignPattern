package structuralpattern.adapter.adapter;

import structuralpattern.adapter.adaptee.Adaptee;
import structuralpattern.adapter.target.target;

/**
 * 适配者 转换器
 *
 * @author hui
 * @date 2019/7/22
 */
public class Adapter implements target {
    private Adaptee adaptee=new Adaptee();

    @Override
    public void xiong() {
        adaptee.gay();
    }
}
