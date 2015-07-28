package com.getjavajob.training.algo.init.hafizov;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by admin on 19.07.2015.
 */
public class Task13_012 {
    static Database d = new Database();

    public static void main(String[] args) {
        init();
        d.showEmployees();//выводим всех сотрудников
    }

    public static void init() {
        d.addEmployee("Ivan", "Ivanov", "St. petrovskii", 05, 2010);
        d.addEmployee("Maksim", "Vershinin", "Aleksandrovich", "Str. ivanovskaya 42", 06, 2014);
        d.addEmployee("Artem", "Juravlev", "str. mayouvskaya 75", 02, 2007);
        d.addEmployee("Anna", "Ivanova", "Evgeevna", "Str. babushkinskaya 12", 01, 2015);
        d.addEmployee("Olga", "Komkova", "str. dubrovskaya 7", 4, 2014);
        d.addEmployee("Pavel", "Semenov", "str. pedikovskaya 3", 11, 2011);
        d.addEmployee("Sergey", "Indukov", "str. pedikovskaya 3", 6, 2014);
    }

    public static int getWorkedYears(int todayMonth, int todayYear, String name) {
        return d.getWorkedYears(todayMonth, todayYear, name);
    }

    public static String find(String str) {
        return d.find(str);
    }

    public static String printEm(int month, int year) {
        return d.printEmployeesWorkedOver3Years(month, year);
    }
}

class Employee {
    private String name,sername,address;
    private String middleName = "";
    private int month, year;

     Employee(String name, String sername, String address, int month, int year) {
        this.name = name;
        this.sername = sername;
        this.address = address;
        this.year = year;
        this.month = month;
    }

    Employee(String name, String sername, String middleName, String address, int month, int year) {
        this.name = name;
        this.sername = sername;
        this.middleName = middleName;
        this.address = address;
        this.year = year;
        this.month = month;
    }

    //геттеры и сеттеры
    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkedYears(int month, int year) {
        if (month > 0 && month < 13 && year > 1950 && year < 2100) {
            return month >= this.month ? year - this.year : year - this.year - 1;
        }
        return 0;
    }

    public void setDate(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

}

class Database {
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(String name, String sername, String address, int month, int year) {
        employees.add(new Employee(name, sername, address, month, year));
    }

    public void addEmployee(String name, String sername, String middleName, String address, int month, int year) {
        employees.add(new Employee(name, sername, middleName, address, month, year));
    }

    public int getWorkedYears(int month, int year, String name) {// перезагруженный метод поиска с помошю имени
        for (Employee em : employees) {
            if (em.getName().toLowerCase().contains(name.toLowerCase()) | em.getSername().toLowerCase().contains(name.toLowerCase())) {
                return employees.get(employees.indexOf(em)).getWorkedYears(month, year);
            }
        }
        return 0;
    }

    public String printEmployeesWorkedOver3Years(int month, int year) {
        String result = new String();
        for (Employee em : employees) {
            if (employees.get(employees.indexOf(em)).getWorkedYears(month, year) >= 3) {
                result += getEm(em) + " ";
            }
        }
        return new StringBuilder(result).deleteCharAt(result.length() - 1).toString();//удал€ю последний пробел
    }

    public String find(String str) {
        for (Employee em : employees) {
            if (em.getName().toLowerCase().contains(str.toLowerCase()) | em.getSername().toLowerCase().contains(str.toLowerCase()) | em.getMiddleName().toLowerCase().contains(str.toLowerCase())) {
                return getEm(em);
            }
        }
        return "not found";
    }

    public void showEmployees() {
        for (Employee em : employees) {
            System.out.println(employees.indexOf(em) + " " + getEm(em));
        }
    }

    private String getEm(Employee em) {
        return em.getName() + " " + em.getSername() + (em.getMiddleName() == "" ? "" : em.getMiddleName());//добовл€ем отчество если она не пуста
    }
}

