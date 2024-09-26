package org.example;
import java.util.Scanner;

/**
 * It receives a number input by the keyboard and transform to binary
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your age: ");
        int age = sc.nextInt();
        int numeroVelas = 0;
        String bin = Integer.toBinaryString(age);

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1'){
                numeroVelas++;
            }
        }
        System.out.println(numeroVelas);
    }
}