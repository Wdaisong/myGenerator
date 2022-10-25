package test;

public class enumTest {
    public static void main(String[] args) {

        //Color.YELLO.Preferences(Color.BLANK);
        Color.YELLO.isLike();
    }
}

interface Behaviour {
    void Preferences(Color yello);

    void isLike();

}

enum Color implements Behaviour {
    RED("红色", 1, "unlike"), GREEN("绿色", 2, "unlike"), BLANK("白色", 3, "like"), YELLO("黄色", 4, "like");
    // 成员变量
    private String name;
    private int index;
    private String like;

    // 构造方法
    private Color(String name, int index, String like) {
        this.name = name;
        this.index = index;
        this.like = like;
    }

    public String getName() {
        return this.name;
    }

    public int getIndex() {
        return this.index;
    }

    public String getLike() {
        return this.like;
    }

    @Override
    public void Preferences(Color yello) {
        System.out.println(yello.name);
        System.out.println(yello.index);
        System.out.println(yello.like);
        System.out.println("---------------");
        System.out.println(yello.getName());
        System.out.println(yello.getIndex());
        System.out.println(yello.getLike());
    }

    @Override
    public void isLike() {
        System.out.println(this.name);
        System.out.println(this.index);
        System.out.println(this.like);
    }
}
