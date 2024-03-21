import java.util.Scanner;

public class Decrising_order {
    public static void main(String[] args) {

        System.out.println("Enter Three Integer :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();

        if(a>b && b>c){
            System.out.println(+ a +"," + b + "," +c );
        }
         else if(a>c && c>b){
            System.out.println(+ a +"," + c + "," + b );
        }
        else if(a>b && b>c){
            System.out.println(+ a +"," + b + "," +c );
        }
        else if(b>a && a>c){
            System.out.println(+ b +"," + a + "," +c );
        }
        else if(b>c && c>a){
            System.out.println(+ b +"," + c + "," +a );
        }
        else if(c>a && a>b){
            System.out.println(+ c +"," + a + "," +b );
        }
        else{
            System.out.println(+ c +"," + b + "," +a );
        }

    }
}
