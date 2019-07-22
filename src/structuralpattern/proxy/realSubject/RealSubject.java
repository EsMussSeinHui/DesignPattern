package structuralpattern.proxy.realSubject;

import structuralpattern.proxy.subject.Subject;

/**
 * real Subject class
 *
 * @author hui
 * @date 2019/7/22
 */
public class RealSubject implements Subject {
    @Override
    public void addXiong(String userId,String userName) {
        System.out.println("Xiong add"+userId+"   add"+userName);
    }

    @Override
    public void addGay(String userId, String userName) {
        System.out.println("Gay add"+userId+"   add"+userName);

    }

}
