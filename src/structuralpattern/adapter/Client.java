package structuralpattern.adapter;

import structuralpattern.adapter.adapter.Adapter;
import structuralpattern.adapter.target.target;

/**
 * client
 *
 * @author hui
 * @date 2019/7/22
 */
public class Client {
    public static void main(String[] args) {
        target tar=new Adapter();
        tar.xiong();
    }
}


//其实最后客户端都很有意义。
//客户端只有 依赖  target   其实耦合度很低