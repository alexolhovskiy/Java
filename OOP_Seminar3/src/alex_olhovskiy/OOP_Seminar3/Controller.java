package alex_olhovskiy.OOP_Seminar3;

import java.util.Scanner;

public class Controller {
	private StreamService service=new StreamService();
	private Scanner input=new Scanner(System.in);
	private String c="";
	
	public void control()
	{
		while(!c.equals("q"))
		{
			Menu();
			c=input.next();
			switch(c)
			{
				case "p":
					service.streamPrint();
					break;
				case "a":
					service.streamAdd(new StudyStream());
					break;
				case "s":
					service.streamSort();
					break;
			}
		}
	}
	
	public void Menu() {
		System.out.println("Menu");
		System.out.println("Add new Stream   	->a");
		System.out.println("Sort Stream list 	->s");
		System.out.println("Print Stream list 	->p");
		System.out.println("exit                    ->q");
	}

}
