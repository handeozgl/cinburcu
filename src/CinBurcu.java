import java.util.Scanner;

public class CinBurcu {
    public static void main(String[] args) {
        int dogumyili;

        Scanner input = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz= ");
        dogumyili = input.nextInt();

        if (dogumyili % 12 == 0) {
            System.out.println("cin burcunuz maymun");

        } else if (dogumyili % 12 == 1){
            System.out.println("cin burcunuz horoz");
        }else if (dogumyili % 12 == 2){
            System.out.println("cin burcunuz kopek");
        }else if (dogumyili % 12 == 3){
            System.out.println("cin burcunuz domuz");
        }else if (dogumyili % 12 == 4){
            System.out.println("cin burcunuz fare");
        }else if (dogumyili % 12 == 5){
            System.out.println("cin burcunuz okuz");
        }else if (dogumyili % 12 == 6){
            System.out.println("cin burcunuz kaplan");
        }else if (dogumyili % 12 == 7){
            System.out.println("cin burcunuz tavsan");
        }else if (dogumyili % 12 == 8){
            System.out.println("cin burcunuz ejderha");
        }else if (dogumyili % 12 == 9){
            System.out.println("cin burcunuz yilan");
        }else if (dogumyili % 12 == 10){
            System.out.println("cin burcunuz at");
        }else if (dogumyili % 12 == 11){
            System.out.println("cin burcunuz koyun");
        }
    }

}
