package com.encapsulation;

public class Test {

    public static void main(String[] args) {

        Patient patient = new Patient();{

            patient.setId(769750);
            patient.setName("Akshay Mopuru");
            patient.setSsn("299974678");

            System.out.println("Patinet id "+patient.getId());
            System.out.println("Patinet Name  "+patient.getName());
            System.out.println("Patinet SSN "+patient.getSsn());


        }
    }
}
