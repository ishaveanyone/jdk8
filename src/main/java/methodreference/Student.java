package methodreference;

/**
 * Created by Administrator on 2019/4/29.
 */
public class Student {
    private  int age;

    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public  static  int compareByAge(Student student1,Student student2){
        return student1.getAge()-student2.getAge();
    }

    public  static  int compareByName(Student student1,Student student2){
        return student1.getName().compareTo(student2.getName());
    }


    public int compareMyByAge(Student student){
        return this.getAge()-student.getAge();
    }
}
