package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        String bot_name = "Ciri";
        int birth_year = 2021;
        int age;
        int remainder3, remainder5, remainder7;
        int answer;
        Scanner in = new Scanner(System.in);
        String user_name;
        System.out.printf("Hello! My name is %s.\nI was created in %d.\nPlease, remind me your name.\n",bot_name,birth_year);
        user_name = in.nextLine();
        System.out.printf("What a great name you have, %s.\nLet me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.\n", user_name);
        remainder3 = in.nextInt();
        remainder5 = in.nextInt();
        remainder7 = in.nextInt();
        age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15)%105;
        System.out.printf("Your age is %d that's a good time to start programming\nNow I will prove to you that I can count to any positive number you want.\n",age);
        int count  = in.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.printf("%d !\n",i);
        }
        System.out.printf("Let's test your programming knowledge.\nWhy do we use methods?\n");
        System.out.printf("1. To repeat a statement multiple times.\n"
                +"2. To decompose a program into several small subroutines.\n"
                +"3. To determinate the execution time of a program.\n"
                +"4. To interrupt the execution of a program.\n");
        do {
            answer = in.nextInt();
            if (answer == 2){
                System.out.printf("You right!\nGoodbye, have a nice day!");
                break;}
            else System.out.printf("Try again.\n");
        }
        while(answer != 2);
    }
}
