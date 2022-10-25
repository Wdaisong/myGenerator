import bean.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user = new User(".55",12,"man");
        User user2 = new User("0.55",18,"man");
        User user3 = new User(".33",13,".45");
        User user4 = new User(".33",13,".45");
        User user5 = new User(".33",13,".45");
        User user6 = new User(".33",13,".45");
        User user7 = new User(".33",13,".45");
        User user8 = new User(".33",13,".45");
        User user9 = new User(".33",13,".45");
        User user10 = new User(".33",13,".45");
        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);
        list.add(user10);

        for (User vo2 : list) {

// vo2是目标对象
            try{
                //通过getDeclaredFields()方法获取对象类中的所有属性（含私有）
                Field[] fields = vo2.getClass().getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    //设置允许通过反射访问私有变量
                    fields[i].setAccessible(true);
                    //获取字段属性名称
                    String name = fields[i].getName();
                    //将属性名的首字母变为大写，为执行set/get方法做准备
                    String methodName=name.substring(0,1).toUpperCase()+name.substring(1);

                    //获取字段的值
                    Method getMethod=vo2.getClass().getDeclaredMethod("get"+methodName);
                    String value = getMethod.invoke(vo2).toString();

                    //给小数加0号位
                    if ( value.startsWith(".")){
                        //获取Test类当前属性的setXXX方法（私有和公有方法）
                        Method setMethod=vo2.getClass().getDeclaredMethod("set"+methodName,String.class);
                        //获取Test类当前属性的setXXX方法（只能获取公有方法）
                        //Method setMethod=Test.class.getMethod("set"+methodName,String.class);
                        setMethod.invoke(vo2, ("0"+value));

                    }

                }
            }
            catch (Exception ex){
                //处理异常
            }

        }
        System.out.println(list);
    }
}
