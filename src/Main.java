import java.util.Scanner;//funny fing<
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first - fourth task:\n");
        System.out.println("write as many numbers as you want,do't fogot probel ");
        String[] num = input.nextLine().split(" "); //split()  can put not a " "<maybe
        int sum = 0;
        //proga with while,proga with while do too
        //int i=0
        //while(num.length!i){
        //sum += Integer.parseInt(num[i]); !!do!!(1)
        //i++} !!do!!(1)
        for (int i = 0; i < num.length; i++) {//cool length,very comf for this task
            sum += Integer.parseInt(num[i]);
        }
        System.out.println("The sum of the numbers: " + sum);
        System.out.println("five task:\n");
        for (int i = 1; i < 11; i++) {
            System.out.println(1. / i);
        }
        System.out.println("\nsix task:\n");
        int[] number = new int[11];
        System.out.println("not sorting:\n");
        for (int i = 1; i < number.length; i++) {
            number[i] = ((int) (Math.random() * 101));
            System.out.println(number[i]);
        }
        System.out.println("sorting:\n");
        for (int i = number.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (number[j] > number[j + 1]) {
                    int tmp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = tmp;
                }
            }
            System.out.println(number[i]);
        }
        System.out.println("\nseven task:\n");
        System.out.println("Print num for find factorial:");
        int nume = input.nextInt();
        System.out.println( "Factorial !" + nume + " is: " + factorial( nume ) );
    }

    public static int factorial( int nume ) {
        int fact = 1;
        for( int i = 1; i <= nume; i++ ) {
            fact *= i;
        }

        return fact;
    }
    }



//1.1-1.3 did
//1.4 did(&)
//1.6-1.8
