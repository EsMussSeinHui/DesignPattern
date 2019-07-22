package creatingpattern.build.builder.impl;

import creatingpattern.build.builder.Builder;
import creatingpattern.build.product.Product;

/**
 * ConreteBuilder2 class
 *
 * @author syh
 * @date 2019/7/21
 */
public class ConcreteBuilder2 implements Builder {
    private Product p2 = new Product();

    @Override
    public void buildGay() {
        p2.setGay("gay2");
    }

    @Override
    public void buildXiong() {
        p2.setXiong("xiong2");
    }

    @Override
    public Product getResult() {
        return p2;
    }
}
