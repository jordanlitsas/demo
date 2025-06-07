public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Dog dog = new Dog();
        dog.setAction("BARK");
        for (int i = 0; i < 3; i++) {
            System.out.println(dog.getAction());
        }
    }
}
