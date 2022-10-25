import bean.Student;
import bean.Teather;
import bean.User;
import org.springframework.cglib.beans.BeanCopier;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;

public class copyTest {
    public static void main(String[] args) {
        Student user = new Student("55",12,"man",1.2, new BigDecimal(9.9999999),"一班");

        Teather teather = new Teather();

        BeanCopier copier = BeanCopier.create(Student.class, Teather.class, false);
        copier.copy(user, teather, null);

        System.out.println(teather);


    }
}
