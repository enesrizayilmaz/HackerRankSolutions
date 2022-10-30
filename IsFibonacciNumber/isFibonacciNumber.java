import java.util.*; 
import java.io.*;

class Main {
//0 1 1 2 3 5 8 13 21 34 55
  static boolean isPerfectSquare(int x){
    int s = (int) Math.sqrt(x);
    return (s*s == x);
  }
  static boolean isFibonacci(int n){
    return isPerfectSquare(5*n*n +4) || isPerfectSquare(5*n*n -4);
  }
  public static int MathChallenge(int num) {
    if(isFibonacci(num) == true){
      num = 1;
    }else{
      num = 0;
    }
    return num;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    if(MathChallenge(s.nextLine()) == 1){
      System.out.print("yes");
    }else{
      System.out.print("no");
    }
  }

}