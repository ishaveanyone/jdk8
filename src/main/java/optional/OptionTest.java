package optional;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

/**
 * 防止 npe 异常
 * Created by Administrator on 2019/4/26.
 */
public class OptionTest {


    public static void main(String[] args) {
/*


        Optional<String> optional=Optional.of("hello");
//        System.out.println(optional.get());
        optional.ifPresent(s -> {
            System.out.println(optional.get());
        });


        Optional<String> Null=Optional.empty();
        System.out.println(Null);
*/

//酷炫
        Entity root=new Entity();
        Entity c1=new Entity();
        Entity c2=new Entity();
//        root.entityList= Arrays.asList(c1,c2);

        Optional<Entity> entityOptional=Optional.ofNullable(root);
        entityOptional.map(entity -> entity.getEntityList()).orElse(Collections.emptyList()).forEach(
                entity -> {
                    System.out.println(entity.getClass());
                }
        );












    }

}
