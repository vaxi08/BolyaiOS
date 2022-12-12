import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            Scanner txt = new Scanner(System.in);
            String comm = txt.nextLine();

            if (Objects.equals(comm, "hello")){
                System.out.println("Hello World");
            }
            else if (Objects.equals(comm, "info")){
                System.out.println("v1");
            }
            else if (Objects.equals(comm, "exit")){
                System.out.println("Bye");
                Thread.sleep(1000);
                break;
            }
        }
    }
}