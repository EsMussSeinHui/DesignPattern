package creatingpattern.AbstractFactory;

import creatingpattern.AbstractFactory.abstractF.impl.ref_factory;
import creatingpattern.AbstractFactory.abstractP.gayP.gayInterface;
import creatingpattern.AbstractFactory.abstractP.xiongP.xiongInterface;

import java.util.Scanner;

public class abstractFactoy {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Scanner scanner=new Scanner(System.in);
        ref_factory fac=new ref_factory(null);
        while(true){
            String factory=scanner.next();
            fac.setClassname(factory);

            gayInterface gay=fac.gay();
            gay.show();

            xiongInterface xiong=fac.xiong();
            xiong.show();
        }

    }
}
