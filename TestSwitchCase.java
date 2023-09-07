/**
 * switch(表达式){
 * case value:
 * //
 * break;// 可选
 * case value:
 * //
 * break;
 * default: // 可选
 * // 语句
 * <p>
 * }
 * switch()中的表达式支持类型：byte、short、char、int、String
 */
public class TestSwitchCase {

    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            // 因为B条件没有break语句，会有穿透效果，直接输出C的结果，直到遇到break语句
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("等级是：" + grade);

        /*
        * Java方法
        * 优点：
        * 1、使程序变得简短而清晰。
        * 2、有利于程序代码维护。
        * 3、提高开发效率。
        * 4、提高了代码重用性。
        *
        * 命名规则：
        * 1、第一个单词首字母小写，后面单词首字母大写，一般不使用连接符。addPrice
        * 2、下划线 测试类使用 JUnit
        * 3、方法定义：
        * 修饰符 返回值类型 方法名(参数类型 参数名) {
        *       // 方法体
        *       return 返回值；
        * }
        * public void  niHao()
        *
        */

    }
}
