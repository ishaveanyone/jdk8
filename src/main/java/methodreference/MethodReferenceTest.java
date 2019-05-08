package methodreference;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Administrator on 2019/4/26.
 */
public class MethodReferenceTest {


    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3);

        integerList.forEach(System.out::print);


    }

    public String funnyTest(String str, Function<String,String> function){
        return function.apply(str);
    }


    @Test
    public void sort0(){
        Student student1=new Student(70,"w");
        Student student2=new Student(20,"r");
        Student student3=new Student(50,"z");
        List<Student> students=Arrays.asList(student1,student2,student3);

        students.sort((o1, o2) ->Student.compareByAge(o1,o2));
//        使用静态方法引用
        students.sort(Student::compareByAge);
//        调用方作为第一个参数，其实每一个都调用了这个方法，
        students.sort(Student::compareMyByAge);

        students.forEach(student -> System.out.println(student.getAge()));

    }


    @Test
    public void sort1(){
        Student student1=new Student(70,"w");
        Student student2=new Student(20,"r");
        Student student3=new Student(50,"z");
        List<Student> students=Arrays.asList(student1,student2,student3);
        StudentComparetor studentComparetor=new StudentComparetor();

        students.sort((o1, o2) ->
            studentComparetor.compareByAge(o1,o2)
        );
        students.sort(studentComparetor::compareByAge);
        students.forEach(student -> System.out.println(student.getAge()));

    }


    @Test
    public void sort2(){
        MethodReferenceTest methodReferenceTest=new MethodReferenceTest();
        System.out.println(methodReferenceTest.funnyTest("hello",String::new));

    }

}
