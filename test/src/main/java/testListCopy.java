import bean.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class testListCopy {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list.removeAll(list2);
        System.out.println(list);
    }
}
