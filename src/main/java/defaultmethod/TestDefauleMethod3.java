package defaultmethod;

/**
 * Created by Administrator on 2019/4/29.
 */
public class TestDefauleMethod3 extends TestDefauleMethod2 implements DefaultMethod1{
    @Override
    public void test() {
//TestDefauleMethod2 优先级高于 接口的优先级
    }
}
