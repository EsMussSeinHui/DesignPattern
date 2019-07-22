package creatingpattern.AbstractFactory.abstractF.impl;

import creatingpattern.AbstractFactory.abstractP.gayP.gayInterface;
import creatingpattern.AbstractFactory.abstractP.xiongP.xiongInterface;

public class ref_factory  {
   private String classname;
   public ref_factory(String classname){
       this.classname=classname;
   }

    public void  setClassname(String classname){
       this.classname=classname;
   }


    public gayInterface gay() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
      return (gayInterface) Class.forName("creatingpattern.AbstractFactory.abstractP.gayP.impl.gay"+classname).newInstance();

   }


    public xiongInterface xiong() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       return (xiongInterface) Class.forName("creatingpattern.AbstractFactory.abstractP.xiongP.impl.xiong"+classname).newInstance();
    }
}
