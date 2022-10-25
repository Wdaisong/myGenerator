package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends User{
    private String className;

    public Student(String name, Integer age, String sex, Double score, BigDecimal phone, String className) {
        super(name, age, sex, score, phone);
        this.className = className;
    }

    public Student(String name, int age, String sex, String className) {
        super(name, age, sex);
        this.className = className;
    }
}
