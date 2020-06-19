package NullPointer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: liangxiao
 * @Date: Created in 2020/4/15
 */
public class NullPointerTest {
    public static void main(String[] args) {
        Set<Integer> set1 = null;
        Set<Integer> set2 = new HashSet<Integer>();
        Set<Integer> set3 = nullSet1();
        Set<Integer> set4 = nullSet2(1);
        NullPointerTest nullPointerTest = new NullPointerTest();
        Set<Integer> set5 = nullPointerTest.nullSet3(2);


        //编译报错，null值不能直接遍历
//        for (Integer integer : set1) {
//            System.out.println(integer);
//        }

        // 编译报错
//        for (Integer integer : set3) {
//            System.out.println(integer);
//        }

        // 编译报错
//        for (Integer integer : set4) {
//            System.out.println(integer);
//        }

        // 编译报错
//        for (Integer integer : set5) {
//            System.out.println(integer);
//        }

        // 编译报错
//        for (Integer integer : set2) {
//            System.out.println(integer);
//        }


    }

    private static Set<Integer> nullSet1() {
        if (1 == 1) {
            return null;
        } else {
            return new HashSet<>();
        }
    }

    private static Set<Integer> nullSet2(int a) {
        if (a == 1) {
            return null;
        } else {
            return new HashSet<>();
        }
    }

    private Set<Integer> nullSet3(int a) {
        if (a == 1) {
            return null;
        } else {
            return new HashSet<>();
        }
    }
}
