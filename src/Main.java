import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        start(new Scanner(System.in));
    }

    
    static void start(Scanner sc) {
        show_user_instructions();
        while(sc.hasNext()){
            //passar linha para o journaling?
        };

    }

    static void show_user_instructions() {
        System.out.println("Instruções :)");
    } 

}
