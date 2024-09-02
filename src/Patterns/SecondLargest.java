package Patterns;

public class SecondLargest {

    int[] arr = new int[50];

    int arrLength = 10;

    public void CreateArray(){

        for (int i = 0; i < arrLength; i++){
            arr[i] = (int)(Math.random()*10) + 10;
        }
    }

    public void PrintArray(){

        for (int i = 0; i < arrLength; i++){
            System.out.println(i + " : " + arr[i]);
        }
    }

    public int secondLargest(){

        int secondMax = 0;
        int firstMax = 0;

        for (int i = 0; i < arrLength; i++){

            if (arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {

        SecondLargest sl = new SecondLargest();

        sl.CreateArray();
        sl.PrintArray();

        System.out.println("Second largest");
        System.out.println(sl.secondLargest());
        sl.PrintArray();

    }
}
