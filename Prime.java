//  public class Prime {
//     public static void main(String[] args) {
//         int n = Integer.parseInt(args[0]);
//         boolean prime=true;

//         for (int i=2;i<n;i++)
//         {
//             if (n % i == 0)
//             {
//                 prime =false;
//                 break;
//             }
//         }
//         System.out.println(prime);
//     }
//  }
    
public class Prime {
    public static void main(String[] args) throws Exception{
        
        int n = Integer.parseInt(args[0]);
        boolean prime=true;

        for (int i=2;i<n;i++)
        {
            if (n % i == 0)
            {
                prime = false;
                System.out.println("prime not number");
                break;
            }
        }

        if (n==1||n==0)
        {
            System.out.println("it is not prime number");
            return;
        }
        
        System.out.println(prime);
    }
}
