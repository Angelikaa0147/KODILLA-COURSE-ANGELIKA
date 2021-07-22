package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theUser");

        String result = simpleUser.getUserName();
        if(result.equals("theUser")){
            System.out.println("OK");
        }else System.out.println("ERROR");

        //test for caltulator

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(2,5);
        if(resultAdd==7){
            System.out.println("OK");
        }else System.out.println("ERROR");

    }
}
