package jptvgame;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    }

    public void run() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-----    GAME    -----");
        System.out.println("Программа загадала число! от 1 до 9;");
        System.out.println("Попробуй угадать!");
        System.out.println();

        int number = random.nextInt(9-0+1) - 0;
        int attempts = 10;
        int count = 0;
        boolean repeat = true;
        
        while (repeat) {
            if (scanner.hasNextInt()) {
  
                int answer = scanner.nextInt();
                attempts--;
                count++;

                if (answer > number) {
                    System.out.println("Заданое число меньше!");}

                else if (answer < number) {
                    System.out.println("Заданое число больше!");}
   
                else if (answer == number) {
                    System.out.println("-------------------------------");
                    System.out.println("Угадал! Число -> " + number);
                    System.out.println("Всего использованно попыток -> " + count);
                    System.out.println("-------------------------------");
                    repeat = false;}

                else {
                    System.out.println("-------------------------------");
                    System.out.println("Неугадал! Попробуй еще! Попыток - " + attempts);
                    System.out.println("-------------------------------");}

                if (attempts == 0) {
                    System.out.println("Вы проиграли =(");
                    repeat = false;
                    System.out.println("-------------------------------");}    
            }
            
            else {
                System.out.println("Введите цифру!");}

            System.out.println("-------------------------------");
            System.out.println("Чтобы выйти из программы нажмите - q!");
            System.out.println("-------------------------------");

            String q = scanner.nextLine();
            if (q.equals("q")) {
                repeat = false;}
            
        }
        System.out.println("-----    EXIT    -----");
    }   
}
