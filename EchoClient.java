import java.io.*;
import java.net.*;
public class EchoClient {
public static void main(String[] args) throws Exception {
String host = "10.10.11.17";
int port = 1234;
Socket socket = new Socket(host, port);
BufferedReader in = new BufferedReader(
new InputStreamReader(socket.getInputStream()));
PrintWriter out = new PrintWriter(
socket.getOutputStream(), true);
BufferedReader userInput = new BufferedReader(
new InputStreamReader(System.in));
System.out.print("Enter message: ");
String message = userInput.readLine();
long start = System.nanoTime();
out.println(message);
String response = in.readLine();
long end = System.nanoTime();
long rtt = (end - start) / 1_000_000; // ms
System.out.println("Server replied: " + response);
System.out.println("RTT: " + rtt + " ms");
socket.close();
}
}