package defaultmethod;

/**
 * Created by Administrator on 2019/4/29.
 */
public class TestDefauleMethod2 implements DefaultMethod1{
    @Override
    public void test() {
        DefaultMethod1.super.test();
    }
}
