package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        // Ниже выполнение первого задания.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Задание 2");
        // Ниже выполнение второго задания.
        String fullNameLowerCase = "Ivanov Ivan Ivanovich";
        String upperCase = fullNameLowerCase.toUpperCase();
        System.out.println(upperCase);

        System.out.println("Задание 3");
        // Ниже выполнение третьего задания.

        String fullNameRu = "Семёнов Семён Семёнович";
        String[] words = fullNameRu.split(" ");
        for (int i = 0; i < words.length; i++) words[i] = words[i].replace("ё", "e");
        String resultFullName = Arrays.toString(words)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println("Данные ФИО сотрудника — " + resultFullName);
    }
}
