public class Main {
    //test
    public static void main(String[] args) {
        String[] arr = {"Hello", "world"};
        StringBuilder sb = new StringBuilder();

        for (String outer : arr) {
            for (String inner : arr) {
                System.out.print(outer + " " + inner);
            }
        }
        
    }
}