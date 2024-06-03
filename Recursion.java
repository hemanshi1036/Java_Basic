public public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        int b = r.sum(10);  // sum of 1st 10 natural number
        System.out.println("The Sum is :" +b);
    }
    int sum(int a){
        if(a>0){
            return a + sum(a-1);
        } 
        else{
            return 0;
        }
    }
} {
    
}
