package project;

import java.util.*;

public class Main {
    public static void dataDeal() {


        List<AbstractMoney> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dollar(6));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(8));
        piggyBank.add(new Penny(10));
        piggyBank.forEach((c) -> {
            System.out.println("Coin: " + c.getType() + "," + " Total: " + "$" + c.getTotal());
        });
        double total = 0;
        for (AbstractMoney i : piggyBank) {
            total += i.getTotal();
        }
        System.out.println("Over All Bank Total: " + "$" + total);
    }

    public static void main(String[] args) {
        dataDeal();
    }
}

// javac project/*.java
//jar cvfe project.jar project.Main project/*.class
//java -jar project.jar