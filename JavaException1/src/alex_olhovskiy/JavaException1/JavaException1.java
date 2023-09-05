package alex_olhovskiy.JavaException1;

import java.util.Arrays;
import java.util.Scanner;

public class JavaException1 {

	public static void main(String[] args) {
//		int[]arr=new int[4];
//		
//		try {
//			System.out.println("Befor exception");//syso->ctrl+space->enter
//			arr[7]=10;
//			System.out.println("This message not print");
//		}catch(ArrayIndexOutOfBoundsException exception) {//try перехватывает ошибку и если есть catch то есть возможность это перехваченное обработать!
//			System.out.println("Out of arr range");
//		}
//		System.out.println("After exception");

//		int[]a={1,5,11,45,7,34,2,8};
//		int[]b= {3,0,2,4,0,2};
//		for(int i=0;i<a.length;i++)
//		{
//			try {
//				System.out.println(""+a[i]+"/"+b[i]+"="+a[i]/b[i]);
//			}/*catch(ArrayIndexOutOfBoundsException e) {//сразу два перехватчика - каждый сработает на свое
//				System.out.println("out of bounds");
//			}catch(ArithmeticException e) {
//				System.out.println("zero division");
//			}*/catch(Throwable e) {// главное исключение - ловит все и исключения и ошибки!Самый главный, под ним - Exception - ловит исключения и Error - ошибки
//				System.out.println("Error");
//			}
//		}
		
//		try {//внешний try - ловит более  крутые ошибки!
//			for(int i=0;i<a.length;i++)
//			{
//				try {//внутренний try - после него прога продолжает крутиться
//					System.out.println(""+a[i]+"/"+b[i]+"="+a[i]/b[i]);
//				}catch(ArithmeticException e) {
//					System.out.println("zero division");
//				}
//			}
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("out of bounds");
//		}
		
//		int a=0;
//		int b=10;
//		try {
//			if(a==0)
//			{
//				throw new ArithmeticException("division by zerro");//создаем исключение
//			}
//			System.out.println(b/a);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());//division by zerro
//			System.out.println(e);//division by zerro
//			e.printStackTrace();// покажет где исключение
//		}
		
//	      int[]arr={1,2,3,4,5,6,7};
//	      System.out.println(arr[arr.length]);
		
//	      int a=10;
//	      int b=0;
//	      System.out.println(a/b);	
		
//		String str="123";//"Hello";
//	      int a=Integer.parseInt(str);
		
        int[]a={4, 8, 6,5};
        int[]b={1, 0, 0,1};
		
		System.out.println(Arrays.toString(divArrays(a,b)));
		
		LambdaFunction lambdaFunction = () -> System.out.println("Hello world");
        lambdaFunction.call();
		
	}
	
//    public static int[] subArrays(int[] a, int[] b){
//        int[]c={0};
//        if(a.length==b.length)
//        {
//        	c=new int[a.length];
//	        for(int i=0;i<a.length;i++)
//	        {
//	           c[i]=a[i]-b[i];
//	        }
//        }
//        return c;
//         
//      }
    
    public static int[] divArrays(int[] a, int[] b){
      int[]c={0};
      if(a.length==b.length)
      {
      	c=new int[a.length];
	        for(int i=0;i<a.length;i++)
	        {
	        	try {
	        		c[i]=a[i]/b[i];
	        	}catch(ArithmeticException e) {
	        		System.out.println("Exception:Zerro division");
	        	}
	        }
      }
      return c;

         
      }
    
    interface LambdaFunction {
        void call();
    }

}


