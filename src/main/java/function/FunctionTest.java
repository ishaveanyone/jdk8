package function;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Administrator on 2019/4/23.
 */
public class FunctionTest {


    public Integer comppute(int a , Function<Integer,Integer> function){
        int r=function.apply(a);
        return r;

    }


    public Integer intadd(Integer a,Integer b,BiFunction<Integer,Integer,Integer> biFunction){
        return biFunction.apply(a,b);
    }
    @Test
    public void  test(){
        FunctionTest test=new FunctionTest();
//        传递行为
        System.out.println( test.comppute(1,integer -> 2*integer));
    }


    @Test
    public void  test1(){
        FunctionTest functionTest=new FunctionTest();
        System.out.println(functionTest.intadd(1,2,(integer, integer2) -> {
            return integer+integer2;
        }));
    }
}
