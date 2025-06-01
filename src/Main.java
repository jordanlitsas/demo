//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Dog dog = new Dog();
        dog.setAction("BARK");
        System.out.println(dog.getAction());
        for (int i = 0; i < 3; i++) {
            System.out.println(dog.getAction());
        }
    }
}