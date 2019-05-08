/**
 * 方法引用详解
 * 是lambda表达式的一个语法糖 ，lambda 的方法体实现刚好雷同一个现有的方法
 * 我们可以将方法引用看成一个方法指针
 * System.out::print-》 System.out.println();
 *
 * 静态方法引用和静态方法调用要区别开 两者没有一点关系
 * 1. 静态方法引用
 * 2. 引用名（对象名 ）：：实例对象方法名
 * 3. 类名：：实例方法名
 * 4. 构造方法引用 类名：new
 * Created by Administrator on 2019/4/26.
 */
package methodreference;