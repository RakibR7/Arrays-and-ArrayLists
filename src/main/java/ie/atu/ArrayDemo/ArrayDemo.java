package ie.atu.ArrayDemo;
import java.util.Scanner;

public class ArrayDemo{
    public static void main(String[] args)
    {

        int[] arrays;
        int i;
        arrays = new int[10];

        arrays[0] = 100;
        arrays[1] = 200;
        arrays[2] = 300;
        arrays[3] = 400;
        arrays[4] = 500;
        arrays[5] = 600;
        arrays[6] = 700;
        arrays[7] = 800;
        arrays[8] = 900;
        arrays[9] = 1000;

        for(i=0; i<10; i++)
        {
            System.out.println("Elements at index " + i + ": " + arrays[i]);
        }


        Scanner myScan = new Scanner(System.in);
        try
        {
            System.out.println("Enter new value: ");
            arrays[10] = myScan.nextInt();
        }

        catch (ArrayIndexOutOfBoundsException aiob)
        {
            System.out.println("Out of bounds");
        }


        //for arrayslist
        //arrays.remove(1);
        //arrays.get(1);
    }
}
