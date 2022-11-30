package week7;

public class ArraysPractice {

    public static void main(String[] args) {
        one();
    }
    //WAP to input 10 numbers in array and find sum of odd and even numbers separately.
    public static void one(){
        int[] numbers = new int[10]; //{1,2,3,4}
        int odd = 0;
        int even = 0;
        for (int i = 0; i <=9 ; i++) {
            numbers[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){
                even += i;
            }else{
                odd += i;
            }
        }

        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }

}
