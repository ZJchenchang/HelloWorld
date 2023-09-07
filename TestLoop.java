/**
 * 测试Java 三种常见循环：while、 do...while、 for(扩展增强for循环，foreach)
 * 1、while(布尔表达式) {
 *     // 循环体
 * }
 *
 * 2、do {
 *     // 最少执行一次
 * } while(布尔表达式)
 *
 * 3、for(初始化；布尔表达式；单次步长) {
 *    // 内容
 * }
 * for在循环之前，循环次数已经确定了
 */
public class TestLoop {

    public static void main(String[] args) {

        int i = 10;
        // while循环
        while (i < 20){
            System.out.println("i的值是：" + i);
            i++;
            // 换行符
            System.out.println("\n");
        }

        System.out.println("===============");
        // do...while循环
        int x = 10;
        do {
            System.out.println("x的值是：" + x);
            x++;
        }while (x < 20);
        // 因为会再执行一次x++, 会输出20；
        System.out.println(x);
        System.out.println("===============");

        // for循环
        for (int j = 10; j < 20; j++) {
            System.out.println("j的值是：" + j);
        }

    }
}
