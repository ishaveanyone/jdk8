/**
 * 流
 * 1. 惰性求值
 * 2. 及早求值
 * Created by Administrator on 2019/4/30.
 *
 * 流管道 是关闭旧的流 创建新的流对象  流中间操作 是一个懒方法 ，
 * 如果没有遇到终止操作 ，是不会执行的 只有遇到终止操作才会全部执行中间操作 将所有的操作一个个应用
 * 所以只是执行一次循环，再以此循环中 依次执行给定的操作
 *
 * 外部迭代  自己 code 迭代代码 和处理逻辑
 * 迭代 代码 通过 jvm实现 自己只要 实现处理逻辑就行
 *
 * 在流中还存在短路操作 ，&& || 那不就是所有的操作满足的就执行 ，那么后面就不会在执行了
 */
package stream;