package challenges;

public class FizzBuzz {

    static String result;

    public static String testTheNumber(int num){

        //if(((num%3==0)&&(num%5!=0))?result="Fizz":((num%5==0)&&(num%3!=0))?result="Buzz":((num%3==0)&&(num%5=0))?result="FizzBuzz":)


        if((num%3==0)&&(num%5!=0))
            result="Fizz";
        else if((num%5==0)&&(num%3!=0))
            result="Buzz";
        else if((num%3==0)&&(num%5==0))
            result="FizzBuzz";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.testTheNumber(3));
        System.out.println(FizzBuzz.testTheNumber(15));
        System.out.println(FizzBuzz.testTheNumber(20));
    }
}
