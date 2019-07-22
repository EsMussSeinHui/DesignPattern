package creatingpattern.build.builder;

import creatingpattern.build.product.Product;

/**
 * builder interface
 *
 * @author hui
 * @date 2019/7/21
 */

public interface Builder {
    void buildGay();
    void buildXiong();
    Product getResult();
}
