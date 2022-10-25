package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
public class Teather extends User {

    private String className;

    private String name;
    private Integer age;
    private String sex;
    private Double score;
    private BigDecimal phone;
}
