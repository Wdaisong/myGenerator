



import bean.User;

import java.util.ArrayList;
import java.util.Objects;

public class nullTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User user2 = new User();

        list.add(user2);

        //if(user2.getAge().equals(null)){
        //    System.out.println("user2.getAge().equals(null) is ture");
        //}
        //if(null.equals(user2.getAge())){
        //    System.out.println("user2.getAge() == null is ture");
        //}
        if(user2.getName() == null){
            System.out.println("user2.getAge() == null is ture");
        }
        if(Objects.isNull(user2.getName())){
            System.out.println("Objects.isNull(user2.getName()) is ture");
        }
        if(user2.getAge() == null){
            System.out.println("user2.getAge() == null is ture");
        }
        if(user2.getPhone() == null){
            System.out.println("user2.getAge() == null is ture");
        }
        //if(Double.isNaN(user2.getScore())){
        //    System.out.println("Double.isNaN(user2.getScore()) is ture");
        //}

        //if(StringUtils.isEmpty(user2.getAge()) ){
        //    System.out.println("user2.getAge().isNull() is ture");
        //}
        //if(StringUtils.isBlank(user2.getAge())){
        //    System.out.println("user2.getAge().isEmpty() is ture");
        //}
    }
}
