package com.AbstractFactory.abstractF.impl;

import com.AbstractFactory.abstractF.Abstractfactory;
import com.AbstractFactory.abstractP.gayP.gayInterface;
import com.AbstractFactory.abstractP.xiongP.xiongInterface;

public class ref_factory  {
   private String classname;
   public ref_factory(String classname){
       this.classname=classname;
   }

    public void  setClassname(String classname){
       this.classname=classname;
   }

//    @Override
    public gayInterface gay() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
      return (gayInterface) Class.forName("com.AbstractFactory.abstractP.gayP.impl.gay"+classname).newInstance();

   }

//    @Override
    public xiongInterface xiong() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       return (xiongInterface) Class.forName("com.AbstractFactory.abstractP.xiongP.impl.xiong"+classname).newInstance();
    }
}
