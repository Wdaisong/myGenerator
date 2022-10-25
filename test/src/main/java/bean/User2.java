package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User2 {
    private String name;
    private Integer age;
    private String sex;
    private Double score;
    private BigDecimal phone;

    public User2(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
