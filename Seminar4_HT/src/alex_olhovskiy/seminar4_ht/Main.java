package alex_olhovskiy.seminar4_ht;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		final RedBlackTree tree=new RedBlackTree();
		
		try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
			while(true)
			{
				try {
					int value=Integer.parseInt(reader.readLine());
					tree.add(value);
					System.out.println("finish");
				}catch(Exception ignored) {}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
