package defaultmethod;

/**
 * Created by Administrator on 2019/4/29.
 */
public class TestDefauleMethod implements DefaultMethod1,DefaultMethod2{
    @Override
    public void test() {
        DefaultMethod1.super.test();
    }
}
