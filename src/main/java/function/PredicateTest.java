package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2019/4/26.
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> predicate=s -> {
            return s.length()>8;
        };
        System.out.println(predicate.test("hella000iiaif"));


        List<Integer> list= Arrays.asList(1,2,3,4);
        predicateList(list,integer -> integer<4);
        predicateList(list,integer -> integer instanceof Integer);
    }

    public static void predicateList(List<Integer> list,Predicate<Integer> predicate){
        for(Integer integer :list){
            if(predicate.test(integer)){
                System.out.println(integer);
            }
        }

    }
}
