package Arrays;

public class ArrayStructures {

    private int[] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray(){

        for (int i = 0; i < arraySize; i++){
            theArray[i] = (int)(Math.random()*10) + 10;
        }
    }

    public void printArray(){

        for (int i = 0; i < arraySize; i++){
            System.out.print(i + " : ");
            System.out.println(theArray[i]);
        }
    }

    public int getValueAtIndex(int index){

        if (index >= 0 && index < arraySize){
            return theArray[index];
        }
        return 0;
    }

    public boolean isValueAvailable(int value){

        for (int i = 0; i < arraySize; i++){
            if (theArray[i] == value){
                return true;
            }
        }
        return false;
    }

    public void deleteIndexofArray(int index){

        if (index >= 0 && index < arraySize){

            for (int i = index; i < arraySize - 1; i++){

                theArray[i] = theArray[i + 1];
            }

            arraySize--;
        }
    }

    public void insertValue(int value){
        theArray[arraySize] = value;
        arraySize++;
    }

    public String linearSearchValue(int value){

        String str = "Indexes of values are: ";
        String indexWithValue = "";
        boolean isValue = false;

        for (int i = 0; i < arraySize; i++){

            if (theArray[i] == value){

                indexWithValue += i + " ";
                isValue = true;
            }
        }
        if (isValue){
            str += indexWithValue;
        }

        return str;
    }

    public void bubbleSort(){
        for (int i = 0; i < arraySize - 1; i++){

            for (int j = 0; j < arraySize - i - 1; j++){

                if (theArray[j] > theArray[j + 1]){
                    swapValues(j, j+1);
                }
            }
        }
    }

    public void selectionSort(){

        for (int i = 0; i < arraySize; i++){

            int minimum = i;

            for (int j = i; j < arraySize; j++){

                if (theArray[minimum] > theArray[j]){
                    minimum = j;
                }
            }

            swapValues(i, minimum);
        }
    }

    public void swapValues(int valueOne, int valueTwo){
        int temp;

        temp = theArray[valueOne];
        theArray[valueOne] = theArray[valueTwo];
        theArray[valueTwo] = temp;
    }

    public static void main(String[] args) {
        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();
        newArray.printArray();

//        System.out.println(newArray.getValueAtIndex(2));
//
//        System.out.println(newArray.isValueAvailable(18));

//        newArray.deleteIndexofArray(2);
//        newArray.printArray();

//        newArray.insertValue(25);
//        newArray.printArray();

//        System.out.println(newArray.linearSearchValue(17));

//        System.out.println("Bubble sort");
//        newArray.bubbleSort();
//        newArray.printArray();

        System.out.println("Selection sort");
        newArray.selectionSort();
        newArray.printArray();



    }
}
