# LCM-HCF
import java.util.*;
public class Main
{
    public static int  CalaculateFibonacci(int a,int b){
          int r = b%a;
	        while(r!=0){
	       b = a;
	       a = r;
	       r = b%a;
	        }
	     return a;
	       
    }
	public static void main(String[] args) {
	     int a = 198;
	     int b = 360;
	 int g =  CalaculateFibonacci(a,b);
	 System.out.println("HcF is " + g);
	  int l = (a*b)/g;
	       System.out.print("LCM is " + l);
	}
}
