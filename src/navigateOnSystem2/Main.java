package navigateOnSystem2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean running = false;

	while(!running){
        System.out.println("$>");
        String userInput = scanner.nextLine();
        System.out.println("User said " + userInput);
    }


    }
}
