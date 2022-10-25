import com.sun.org.apache.xalan.internal.xsltc.compiler.FlowList;

import java.util.ArrayList;

public class retainAllTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < 200;i++) {
            list1.add(String.valueOf(i));
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 150; i < 350;i++) {
            list2.add(String.valueOf(i));
        }
        ArrayList<Object> list3 = new ArrayList<>();
        for (int i = 175; i < 375;i++) {
            list3.add(String.valueOf(i));
        }
        plan1(list, list1, list2, list3);

        plan2(list,list1, list2, list3);

    }

    private static void plan2(ArrayList<String> list,ArrayList<String> list1, ArrayList<String> list2, ArrayList<Object> list3) {
        long start = System.currentTimeMillis();
        list1.retainAll(list2);
        list1.retainAll(list3);
        list = list1;
        long end = System.currentTimeMillis();
        System.out.println("retainAll: " + (end-start) + " ms");
        System.out.println("list: " + list.size());
    }

    private static void plan1(ArrayList<String> list, ArrayList<String> list1, ArrayList<String> list2, ArrayList<Object> list3) {
        long start = System.currentTimeMillis();
        for (String s : list1) {
            if (list2.contains(s) && list3.contains(s)){
                list.add(s);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("contains: " + (end-start) + " ms");
        System.out.println("list: " + list.size());
    }
}
