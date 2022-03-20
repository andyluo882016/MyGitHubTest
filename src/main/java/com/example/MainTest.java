package com.example;

import com.example.com.domain.Employee;
import com.test.Showme;

public class MainTest {

    public static void main(String[] args){
        System.out.println(" Show My GitHub Testing");
        System.out.println("this developer1 branch making changing-1");
        System.out.println(getmeployee().toString());
    }

    public static Employee getmeployee(){
        return new Employee("MNJU", 29, "Keven");
       
    }
}
