package ex;
import java.util.*;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    fun1(scn.nextInt(),scn.nextInt());
	}
	
   public static void fun1(int m ,int n){
	    int sum1 = 1;
	    int sum2 = 1;
	    int sum3 = 1;
	    
	    for(int i =1;i<=m;i++){
	    	sum1=sum1*i;
	    }
	    
	    for(int j =1;j<=n;j++){
	    	sum2=sum2*j;
	    }
	    
	    for(int k =1;k<=(m-n);k++){
	    	sum3= sum3*k;
	    }
	    System.out.print(sum1/sum2/sum3);
	    
		}
  

	}