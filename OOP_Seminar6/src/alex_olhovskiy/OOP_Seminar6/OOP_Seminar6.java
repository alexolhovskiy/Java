package alex_olhovskiy.OOP_Seminar6;

public class OOP_Seminar6 {

	public static void main(String[] args) {
		System.out.println("¬ведите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();

	}

}
