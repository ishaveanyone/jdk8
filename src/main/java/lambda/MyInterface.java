package lambda;

/**
 * Created by Administrator on 2019/4/23.
 */
@FunctionalInterface
public interface MyInterface {
    void test();



    default void test1(){

    }

    default void test2(){

    }

    static void test3(){

    }

    static void test4(){

    }
}
