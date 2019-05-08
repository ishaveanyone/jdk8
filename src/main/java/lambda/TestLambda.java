package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Administrator on 2019/4/23.
 */
public class TestLambda {

    @org.junit.Test
    public void main() {
        List<Integer> list= Arrays.asList(1,2,3,4);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }

    @org.junit.Test
    public void test1() {
        TestLambda testLambda=new TestLambda();
        testLambda.test(new MyInterface() {
            @Override
            public void test() {
                System.out.println(0);
            }
        });

        testLambda.test(() -> {
            System.out.println(3);
        });

        MyInterface myInterface=() -> {
            System.out.println(4);
        };
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }


    @org.junit.Test
    public void test2() {
        List<Integer> list= Arrays.asList(1,2,3,4);
//        方法引用创建一个 函数式接口实例
       list.forEach(System.out::print);


    }

    @org.junit.Test
    public void test3() {
        List<Integer> list= Arrays.asList(1,2,3,4);
//        方法引用创建一个 函数式接口实例
        list.forEach(System.out::print);


    }


    @org.junit.Test
    public void test4() {
        List<String> list=Arrays.asList("hello","world");
        //使用流 方式遍历
//        输入参数是s
        list.stream().map(s -> {
            System.out.println(1);return s.toUpperCase();}).forEach(s -> System.out.println(s));
//        输入参数是遍历到的对象 使用方法引用
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

    }
    @org.junit.Test
    public void test5() {
        List<String> list=Arrays.asList("hello","world");
        Collections.sort(list,(o1, o2) -> {
            return o2.compareTo(o1);
        });
        list.forEach(System.out::print);
    }

    @org.junit.Test
    public void test6() {
        List<String> list=Arrays.asList("hello","world");
        Collections.sort(list, Comparator.reverseOrder());
        list.forEach(System.out::print);
    }


    @org.junit.Test
    public void test7() {
        List<String> list=Arrays.asList("hello","world");
        Collections.sort(list, Comparator.reverseOrder());
        list.forEach(System.out::print);
    }
    public void test(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }
}
