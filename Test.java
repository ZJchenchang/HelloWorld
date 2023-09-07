public class Test {

    // Java 常见运算符：+、-、*、/、%、++、--
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = " + (a++)); // 打印完成后才自增，所以还是会显示10；
        System.out.println("a-- = " + (a--)); // 同上
        System.out.println(a);
        System.out.println("++d = " + (++d)); // 先自增，再打印。26


    }

}
