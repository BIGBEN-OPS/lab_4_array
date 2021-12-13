package com.company;
import java.util.Scanner;
/*
 *Написать программу, удаляющую из целочисленного массива A размерности N элементы, равные целому числу X.
 *В результате должен получиться массив не большей размерности.
 *На экран должны выводиться как оригинальное состояние массива, так и итоговое.
 */
public class lab_4_array {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // Длина массива
        int size_of_array = 0;

        System.out.print("Введите длину массива: ");

        while (!in.hasNext("quit")) {
            if (in.hasNextInt()) {
                size_of_array = in.nextInt();

                break;

            } else {
                System.out.println("Ошибка ввода,попробуйте снова.");

                System.out.print("Введите длину массива: ");

                in.next();
            }
        }
        // Элементы массива
        int[] array = new int[size_of_array];

        for (int element = 0; element < array.length; element++) {
            System.out.print("Введите " + element  + " элемент: ");

            while (!in.hasNext("quit")) {
                if (in.hasNextInt()) {
                    array[element] = in.nextInt();

                    break;

                } else {
                    System.out.println("Ошибка ввода,попробуйте снова.");

                    System.out.print("Введите " + element + " элемент: ");

                    in.next();
                }
            }
        }
        // Оригинал
        for (int element = 0;element<array.length; element++) {
            System.out.print(" " + array[element]);
        }
        System.out.println();
        // Удаление
        int deleted_element = 0;

        System.out.print("Введите элемент, который хотите удалить: ");

        while (!in.hasNext("quit")) {
            if (in.hasNextInt()) {
                deleted_element = in.nextInt();

                break;

            } else {
                System.out.println("Ошибка ввода, попробуйте снова.");

                System.out.print("Введите элемент, который хотите удалить: ");

                in.next();
            }
        }

        // Итог
        for (int element = 0;element<array.length; element++) {
            if (array[element] != deleted_element) {
                System.out.print(" " + array[element]);
            }
        }

        in.close();
    }
}

