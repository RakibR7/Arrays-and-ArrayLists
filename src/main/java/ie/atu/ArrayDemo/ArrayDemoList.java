package ie.atu.ArrayDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemoList{
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);
        myList.add(1000);
        loop(myList);

        Scanner myScan = new Scanner(System.in);
        try {
            System.out.println("Enter new value: ");
            myList.add(myScan.nextInt());
            loop(myList);
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("Out of bounds" + aiob);
        }

    }
    public static void loop(ArrayList<Integer> someArrayList)
    {
        int indexValue = 0;
        for (int value: someArrayList)
        {
            System.out.println("Element at index" + indexValue + " : " + value);
            indexValue++;
        }

    }
}
