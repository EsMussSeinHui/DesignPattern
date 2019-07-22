package creatingpattern.build.director;

import creatingpattern.build.builder.Builder;
import creatingpattern.build.product.Product;

/**
 * director class
 *
 * @author hui
 * @date 2019/7/21
 */
public class Director {
    private Builder mBuilder=null;
    public Director(Builder builder){
        mBuilder=builder;
    }
    public Product construct(){
        mBuilder.buildGay();
        mBuilder.buildXiong();
        return mBuilder.getResult();
    }
}
