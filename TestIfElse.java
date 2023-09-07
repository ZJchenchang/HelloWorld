/**
 * 条件语句
 * if...else
 *
 * if...else if...else
 */
public class TestIfElse {

    public static void main(String[] args) {

        int x = 30;
        if (x < 20){
            System.out.println("这是if语句");
        } else {
            System.out.println("这是else语句");
        }
        System.out.println("=========");

        if (x==10){
            System.out.println("x的值是10" );
        } else if (x == 20){
            System.out.println("x的值是20");
        } else {
            System.out.println("x的值是30");
            System.out.println("这是else语句");
        }
    }

}
