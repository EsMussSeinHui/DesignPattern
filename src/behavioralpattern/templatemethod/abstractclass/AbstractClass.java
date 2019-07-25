package behavioralpattern.templatemethod.abstractclass;

/**
 * abstractclass 抽象类
 *
 * @author hui
 * @date 2019/7/24
 */
@SuppressWarnings({"ALL", "AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc"})
public abstract class AbstractClass {
    public void templateMethod(){
        specificMethod();
        abstractMethod();
    }

    public void specificMethod(){
        System.out.println("算法骨架");
    }

    /**
     * 算法特定步骤
     *
     */
    public abstract void abstractMethod();
}
