package cycle;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangxiao
 * @Date: Created in 2020/4/16
 */
public class ForTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (String s : list) {
            System.out.println(s);
        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        List<String> list1 = null;
        for (String s : list1) {
            System.out.println(s);
        }
        for (int i = 0; i < list1.size(); i++) {
            String s = list1.get(i);
            System.out.println(s);
        }

    }
}
