package server;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class HelloServer {
public static void main(String[] args) throws Exception {
ServerSocket server = new ServerSocket(8080);
System.out.println("Server listening on port 8080...");
Socket client = server.accept();
InputStream in = client.getInputStream();
int data;
while ((data = in.read()) != -1) {
System.out.println((char) data);
}
client.close();
server.close();
System.out.println("\nConnection closed.");
}
}