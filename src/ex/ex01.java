package ex;
import java.util.*;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn = new Scanner(System.in);
	    square(scn.nextInt(),scn.next().charAt(0));
		}

    public static void  square(int n,char m){
           for(int i =1;i<=n;i++){
        	for(int j =1;j<=n;j++){
        		System.out.print(m+" ");
        	}
        	System.out.println();
        }
        
        
    	}

    }
    
	
