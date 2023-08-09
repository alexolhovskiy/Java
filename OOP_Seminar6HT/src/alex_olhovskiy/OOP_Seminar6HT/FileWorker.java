package alex_olhovskiy.OOP_Seminar6HT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileWorker implements FileWorkerInterface{
	private final String fileName = "order.json";
	
	public void clearFile() {
		try {
            PrintWriter pw = new PrintWriter(fileName);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void saveToJson(Order order) {
        
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("{\n");
            writer.write("\"Order\":");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
	
	public ArrayList<Order> loadFromJson() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		String str;
		StringBuilder sb=new StringBuilder();
		while((str=br.readLine())!=null)
		{
			sb.append(str);
		}
		br.close();
		
		//System.out.println(sb.toString());
		
		String[]arr=sb.toString().split("Order");
		ArrayList<Order>orders=new ArrayList<>();
		for(int i=1;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			orders.add(strParser(arr[i]));
		}
		return orders;
		
	}
	
	public Order strParser(String str) {
		int startIndex=str.indexOf("clientName",0)+13;
		int endIndex=str.indexOf(",",startIndex)-1;
		String clientName=str.substring(startIndex,endIndex);
		startIndex=str.indexOf("product",endIndex)+10;
		endIndex=str.indexOf(",",startIndex)-1;
		String product=str.substring(startIndex,endIndex);
		startIndex=str.indexOf("qnt",endIndex)+5;
		endIndex=str.indexOf(",",startIndex);
		int qnt=Integer.parseInt(str.substring(startIndex,endIndex));
		startIndex=str.indexOf("price",endIndex)+7;
		endIndex=str.indexOf("}",startIndex);
		double price=Double.parseDouble(str.substring(startIndex,endIndex));
		return new Order(clientName,product,qnt,price);
	}
}
