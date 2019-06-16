import java.io.*;
import java.util.*;
import java.lang.*;
public class PrimeNumbers
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    if ( (N & 1) == 1){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
  }
}
