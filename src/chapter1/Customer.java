package chapter1;

import java.util.Scanner;

public class Customer {

    public String order() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void getReceivedCoffee(String receivedMadeOrder) {
        System.out.println("받은 음료 : " + receivedMadeOrder);
    }
}



