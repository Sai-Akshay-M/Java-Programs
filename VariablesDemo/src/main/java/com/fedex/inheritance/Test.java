package com.fedex.inheritance;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String[] projects = new String[] { "flightReservation", "FlightCheckIN" };
        Manager manager = new Manager(10, "Ramz", "Travel", 1000000, projects);
        System.out.println(manager.id);
        System.out.println(manager.name);
        System.out.println(manager.dept);
        System.out.println(manager.salary);
        System.out.println(Arrays.toString(manager.projects));
        manager.work();

        Developer developer = new Developer(01, "Babu", "Travel", 2000000, "Java Development");
        System.out.println(developer.id);
        System.out.println(developer.name);
        System.out.println(developer.dept);
        System.out.println(developer.salary);
        System.out.println(developer.technology);
        developer.work();

        String[] tools = new String[] { "selenium", "postman" };
        Tester tester = new Tester(02, "Chay", "Travel", 2000000, tools);
        System.out.println(tester.id);
        System.out.println(tester.name);
        System.out.println(tester.dept);
        System.out.println(tester.salary);
        System.out.println(Arrays.toString(tester.tools));
        tester.work();

    }

}
