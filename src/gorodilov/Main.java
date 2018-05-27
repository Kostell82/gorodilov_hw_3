package gorodilov;
/*   1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
        попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли
        указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
        выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {

        int c=1;

        label1:  do {


                       Random rand = new Random();
                       int a = rand.nextInt(10);
                       System.out.println("Секретное число :" + a);


                        for (int i = 0; i < 3; i++)
                            {
                                int d = getNumberFromScanner("Угадайте и введите число от 0 до 9", 0, 9);
                                if (d == a)
                                {
                                   System.out.println("Угадал!");
                                   c = getNumberForGame("Повторить игру еще раз? 1 – да / 0 – нет", 0, 1);
                                   if (c == 0) return;
                                   if (c==1) continue label1;
                                }

                                   if (d < a) System.out.println("Загаданное число больше");
                                   if (d > a) System.out.println("Загаданное число меньше");
                            }

                            System.out.println("Не угадал!");
                            c = getNumberForGame("Повторить игру еще раз? 1 – да / 0 – нет", 0, 1);
                            if (c == 0) return;

                    } while (c==1);

    }

        public static int getNumberFromScanner (String message,int min, int max)
        {
            int x;
            do {
                System.out.println(message);
                x = sc.nextInt();
               } while (x < min || x > max);
            return x;
        }

        public static int getNumberForGame (String message,int min, int max)
        {
            int x;
            do {
                System.out.println(message);
                x = sc.nextInt();
            } while (x < min || x > max);

            return x;
        }


}

