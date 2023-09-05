package simpleserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SimpleServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServerSocket ss;
		try {
			ss = new ServerSocket(8080);
			Socket socket=ss.accept();
			BufferedReader input=new BufferedReader(
			 new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8));
			
			PrintWriter output=new PrintWriter(socket.getOutputStream());
			
			while(!input.ready());
				
			while(input.ready())
			{
				System.out.println(input.readLine());
			}
			output.println("HTTP/1.1 200 Ok");
			output.println("Content-Type: text/html;charset=utf-8");
			output.println("Content-Length:14");
			output.println();
			output.println("<h1>Hello</h1>");
			output.flush();
			
			
			input.close();
			output.close();
			System.out.print("Υΰ, Βϋ βρε υσθ!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
