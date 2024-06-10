package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.addEmployee("Иванов", "Петр", "4256", 9);
        directory.addEmployee("Петров", "Семен", "4257", 2);
        directory.addEmployee("Сидоров", "Геннадий", "4258", 4);
        directory.addEmployee("Меженин", "Ян", "4356", 4);
        directory.addEmployee("Хлебин", "Николай", "4357", 8);
        directory.addEmployee("Булкин", "Петр", "4155", 8);
        directory.addEmployee("Руков", "Игорь", "4156", 2);
        directory.addEmployee("Яблоков", "Роман", "4157", 1);


        System.out.println("Список сотрудников: \n" + directory.getAllEmployees());
        System.out.println("Сотрудники со стажем от 5 лет: \n" + directory.getEmployeesByExperience(5));
        System.out.println("Номер телефона Петрова: " + directory.getPhoneNumbersByFirstName("Петров"));
        System.out.println("Номер телефона Хлебина: " + directory.getPhoneNumbersBySecondName("Николай"));
        System.out.println("Табельный номер Булкина: " + directory.getPersonnelNumbersByFirstName("Булкин"));
        System.out.println("Табельный номер Яблокова: " + directory.getPersonnelNumbersBySecondName("Роман"));
        System.out.println("С табельным номером 5: " + directory.getEmployeeByPersonnelNumber(5));


        System.out.println("Список сотрудников: \n" + directory.getAllEmployees());
    }
}