package stream;

import jdk.nashorn.api.scripting.ScriptUtils;
import org.junit.Test;

import java.util.*;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import static java.util.stream.Collectors.*;//静态导入方法

import java.util.stream.Collector;
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

        String str =stream.collect(joining(",")).toString();
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

        List list3= stream.flatMap(o -> o.stream()).map(integer -> integer*integer).collect(toList());

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

// 并行流 串行流
    @Test
    public  void test4(){
        List<String> list =new ArrayList<>(5000000);
        for (int i=0;i<5000000;i++){
            list.add(UUID.randomUUID().toString());
        }

        long startTime=System.nanoTime();

        list.parallelStream().sorted().count();
//        list.stream().sorted().count();

        long endTime=System.nanoTime();

        System.out.println("花费时间："+(TimeUnit.NANOSECONDS.toMillis(endTime-startTime)));

    }



    // 并行流 串行流 流短路
    @Test
    public  void test5(){
        List<String> list=Arrays.asList("hello","aaaaa","aassddd","dffa");
        list.stream().filter(s -> s.length()==5).limit(1).forEach(s -> System.out.println(s.length()));
    }

    // 关于使用flatMap
    @Test
    public  void test6(){

        List<String> list=Arrays.asList("hello word","hello hi","ken xixi","hi xixi");
        list.stream().map(s -> s.split(" ")).
                flatMap(strings ->{
                    for(int i=0;i<strings.length;i++){
                        strings[i]=strings[i]+"1";
                    }
                    return Arrays.stream(strings);
                }).distinct().forEach(System.out::println);
    }

    @Test
    public  void test7(){
        List<String> list1=Arrays.asList("hello","hi","你好");
        List<String> list2=Arrays.asList("王五","赵四","张三");
        list1.stream().flatMap(s -> list2.stream().map(s1 -> s+" "+s1)).
                collect(toList()).forEach(System.out::println);

    }

//  使用分组
    @Test
    public  void test8(){
        Student student1 =new Student("a",11);
        Student student2 =new Student("b",12);
        Student student3 =new Student("b",13);
        Student student4 =new Student("c",14);
        Student student5 =new Student("a",15);

        List<Student> list=Arrays.asList(student1,student2,student3,student4,student5);
        Map<String,List<Student>> stringListMap= list.stream().collect(groupingBy(Student::getName));
        for(Map.Entry<String,List<Student>> entry:stringListMap.entrySet()){

            System.out.println(entry.getKey());
            entry.getValue().forEach(student -> System.out.println(student.getAge()));
        }
    }



    // 越具体越好 ，针对你处理的问题 ，越具体的 流 越好 比如求和 那么就用 intstream
    @Test
    public  void test9(){
        Student student1 =new Student("a",11);
        Student student2 =new Student("b",12);
        Student student3 =new Student("b",13);
        Student student4 =new Student("c",14);
        Student student5 =new Student("a",15);

        List<Student> list=Arrays.asList(student1,student2,student3,student4,student5);
    }
}
