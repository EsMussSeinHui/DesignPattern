package creatingpattern.build;

import creatingpattern.build.builder.Builder;
import creatingpattern.build.builder.impl.ConcreteBuilder1;
import creatingpattern.build.builder.impl.ConcreteBuilder2;
import creatingpattern.build.director.Director;
import creatingpattern.build.product.Product;

/**
 * Client
 *
 * @author hui
 * @date 2019/7/21
 */
public class Client {
    public static void main(String [] args){
        show(new ConcreteBuilder1());
        show(new ConcreteBuilder2());
    }

    /**
     *
     * @param builder
     */
    private static void show(Builder builder){
        Director director=new Director(builder);
        Product p=director.construct();
        System.out.println(p.getGay());
        System.out.println(p.getXiong());
    }
}
