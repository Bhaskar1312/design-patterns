package _005;

public class ClassicSingletonClient {
    public static void main(String[] args) {
        ClassicSingleton singleton = ClassicSingleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
