package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Homework22.txt");) {
            writer.write("A a");
            writer.write("\nB b");
            writer.write("\nC c");
            writer.write("\nD d");
            writer.write("\nE e");
            writer.write("\nF f");
            writer.write("\nG g");
            writer.write("\nH h");
            writer.write("\nI i");
            writer.write("\nJ j");
            writer.write("\nK k");
            writer.write("\nL l");
            writer.write("\nM m");
            writer.write("\nN n");
            writer.write("\nP p");
            writer.write("\nO o");
            writer.write("\nQ q");
            writer.write("\n1");
            writer.write("\n2");
            writer.write("\n3");
            writer.write("\n4");
            writer.write("\n5");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader reader = new FileReader("Homework22.txt")) {
            Scanner scanner = new Scanner(reader);
            int i = 0;
            while (scanner.hasNextLine()) {
                i++;
                System.out.println(i + ": " + scanner.nextLine());

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
