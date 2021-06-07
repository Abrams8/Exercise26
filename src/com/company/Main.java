package com.company;    


import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String newText = in.nextLine();
        int charBefore = newText.length();
        int charAfter = newText.replaceAll("[.,!?:]", "").length();
        int result = charBefore - charAfter;
        System.out.println("В тексте " + result + " знаков препинания.");
    }
}
