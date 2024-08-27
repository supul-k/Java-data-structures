public class StarPattern {

    public void starPyrmaid(int height){

        for (int i = 0; i < height; i++){

            for (int k = 0; k < height - i; k++){
                System.out.print(" ");
            }

            for (int j = i; j >= 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        StarPattern sPattern = new StarPattern();

        sPattern.starPyrmaid(15);
    }
}
