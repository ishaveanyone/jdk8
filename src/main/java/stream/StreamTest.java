package stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2019/4/30.
 */
public class StreamTest
{
//    创建stream 的方式
    Stream stream =Stream.of("hello","hello2");

    String[] args={"a","b"};
    Stream stream2=Stream.of(args);
    Stream stream3= Arrays.stream(args);
    List<String> list=Arrays.asList(args);
    Stream stream4=list.stream();


    @Test
    public  void test0(){
        IntStream.of(1,2,3).forEach(System.out::print);
        IntStream.range(3,6).forEach(System.out::print);
    }
    @Test
    public  void test1(){

        Stream stream =Stream.of("hello","hello2");
//        List<String> list=(List<String>)stream.collect(Collectors.toList());
//        list.forEach(s ->{
//            System.out.println(s);
//        });

        String str =stream.collect(Collectors.joining(",")).toString();
        System.out.println(str);
//        List<String> list1= (List<String>)stream.collect(Collectors.toCollection(ArrayList::new));
//        list1.forEach(System.out::print);

    }


    @Test
    public  void test2(){

        List<String> list=Arrays.asList("a","b");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Integer> list2=Arrays.asList(1,2,3);
        list2.stream().map(integer -> integer*integer).forEach(System.out::println);

        Stream<List<Integer>> stream=Stream.of(Arrays.asList(1,2),Arrays.asList(3),
                Arrays.asList(4,5,6));

        List list3= stream.flatMap(o -> o.stream()).map(integer -> integer*integer).collect(Collectors.toList());

        list3.forEach(System.out::println);


    }



    @Test
    public  void test3(){
//3 5 7 9 11
// int sum=0;
    Stream.iterate(1,integer -> integer+2).limit(6).
                filter(integer -> integer>2).
                map(integer -> integer*2).skip(2).limit(2).
             mapToInt(value -> value).min().ifPresent(System.out::println);


//        System.out.println(count);


    }
}
