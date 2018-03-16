package navigateOnSystem2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = false;

        while (!running) {
            System.out.println("$>");
            String userInput = scanner.nextLine();
            System.out.println("User said " + userInput);


            switch (userInput) {

                case "dir":
                    //implement method
                    break;
                case "cd":
                    //change directory
                    break;
                case "cd..":
                    //go up in directories
                    break;
                case "prompt":

                    boolean customRunning = false;
                    while(!customRunning){
                        System.out.println();
                        userInput = scanner.nextLine();

                        switch(userInput){


                        }


                    }




                    break;


            }
        }


    }
}
