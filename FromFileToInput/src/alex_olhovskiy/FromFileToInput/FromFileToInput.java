package alex_olhovskiy.FromFileToInput;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FromFileToInput {
	
	public static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		String str="";
		try(FileInputStream fin=new FileInputStream("text.txt"))
        {    
            //int i;
            //while((i=fin.read())!=-1){
            	str+=input.(fin);
                //System.out.print((char)i);
            //}   
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
		System.out.println(str);
		
	}

}
