package alex_olhovskiy.OOP_Seminar4;

public class OOP_Seminar4 {

	public static void main(String[] args) {
		Box<Apple>a_box1=new Box<>("apple");
		Box<Apple>a_box2=new Box<>("apple");
		Box<Orange>o_box1=new Box<>("orange");
		
		for(int i=0;i<10;i++)
		{
			a_box1.Add(new Apple());
		}
		
		for(int i=0;i<5;i++)
		{
			a_box2.Add(new Apple());
		}

		
		for(int i=0;i<8;i++)
		{
			o_box1.Add(new Orange());
		}
		
		for(Apple apple:a_box1)
		{
			System.out.println(apple);
		}
		Sep();
		for(Apple apple:a_box2)
		{
			System.out.println(apple);
		}
		Sep();
		for(Orange orange:o_box1)
		{
			System.out.println((Orange)orange);
		}
		Sep();
		
		System.out.println(o_box1);
		Sep();
		System.out.println(a_box2);
		Sep();
		System.out.println(a_box1);
		Sep();
		
		
		
		System.out.println(o_box1.compare(a_box1));
		Sep();
		
		a_box1.takeAll(a_box2);

		System.out.println(o_box1);
		Sep();
		System.out.println(a_box2);
		Sep();
		System.out.println(a_box1);
		Sep();
	}
	
	public static void Sep()
	{
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}


}
