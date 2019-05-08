package function;

import java.util.function.Supplier;

/**
 * Created by Administrator on 2019/4/26.
 */
public class SupplierTest {


    public static void main(String[] args) {
        Supplier<String> stringSupplier=() -> "hello";
//        构造方法引用
        Supplier<String> stringSupplier2=String::new;
        Supplier<Student> stringSupplier3= Student::new;
        System.out.println(stringSupplier.get());

    }



}
