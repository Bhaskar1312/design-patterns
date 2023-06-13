package _005;

public class EnumSingletonClient {
    public static void main(String[] args) {
        EnumSingleton ob = EnumSingleton.UNIQUE_INSTANCE;
        System.out.println(ob.a);
        ob.a = 10;
        System.out.println(ob.a);
    }
}
