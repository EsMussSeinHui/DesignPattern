package creatingpattern.build.builder.impl;

import creatingpattern.build.builder.Builder;
import creatingpattern.build.product.Product;

/**
 * ConcreteBuilder1 class
 *
 * @author syh
 * @date 2019/7/21
 */
public class ConcreteBuilder1 implements Builder {
    private Product p1 = new Product();

    @Override
    public void buildGay() {
        p1.setGay("gay1");
    }

    @Override
    public void buildXiong() {
     p1.setXiong("xiong2");
    }

    @Override
    public Product getResult() {
        return p1;
    }
}
