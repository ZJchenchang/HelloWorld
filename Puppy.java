/**
 * 通过这次练习，熟悉Java变量的定义、赋值、调用
 *
 * 关于修饰符
 * Java中，可以使用访问修饰符来控制类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。
 *
 * default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
 *
 * private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类
 *
 * public : 对所有类可见。使用对象：类、接口、变量、方法
 *
 * protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（内部类除外）
 * 注意： 若子类与父类不在同一包中：那么在子类中，子类实例可以访问其从父类继承而来的 protected 方法，而不能访问父类实例的protected方法。
 *        使用 protected 修饰符的主要作用，是允许其他包中它的子类来访问父类的特定属性和方法，否则可以使用default
 *
 * 课外补充笔记：
 * 父类中声明为 public 的方法在子类中也必须为 public。
 * 父类中声明为 protected 的方法在子类中要么声明为protected，要么声明为 public，不能声明为 private。
 * 父类中声明为 private 的方法，不能够被子类继承。
 */
public class Puppy {

    int puppyAge;
    public Puppy(String name){
        System.out.println("狗的名字是：" + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("狗的年龄是：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {

        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("变量值是：" + myPuppy.puppyAge);
    }

    /*
    *
    * */
}
