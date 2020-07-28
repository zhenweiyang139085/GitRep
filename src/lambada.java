import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: yzw
 * @Date: 2020/7/24 - 07 - 24 - 20:13
 */
public class lambada {
    public static void main(String[] args) {

        //启动一个线程
//        new Thread(()->{
//            System.out.println("success...");
//        }).start();
        //排序
//        List<String> list = Arrays.asList("java", "c", "python", "go");
//        Collections.sort(list,(a,b)->a.length()-b.length());
//        list.forEach(System.out::println);

        Integer i22 = new Integer(129);
        Integer i23 = new Integer(129);
        System.out.println(i22==i23);



    }
}
