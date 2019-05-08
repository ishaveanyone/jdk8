package optional;

import java.util.List;

/**
 * Created by Administrator on 2019/4/26.
 */
public class Entity {
    private int a;

    List<Entity> entityList;

    public List<Entity> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<Entity> entityList) {
        this.entityList = entityList;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
