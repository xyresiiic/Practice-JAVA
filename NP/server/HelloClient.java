package server;
// import java.net.*;
// import java.io.*;
// public class HelloClient {
// public static void main(String[] args) throws Exception {
// Socket socket = new Socket("10.127.19.253", 8080);
// OutputStream out = socket.getOutputStream();
// out.write("Veer bhai angaar baki sab bhangar".getBytes());
// socket.close();
// }
// }

// import java.net.*;
// import java.io.*;
// import java.util.Scanner;

// public class HelloClient {
//     public static void main(String[] args) throws Exception {
//         // Create scanner inside main
//         Scanner scanner = new Scanner(System.in);

//         // Ask user for IP and port (optional)
//         System.out.print("Enter server IP: ");
//         String serverIP = scanner.nextLine();

//         System.out.print("Enter server port: ");
//         int port = scanner.nextInt();
//         scanner.nextLine(); // consume leftover newline

//         // Ask user for message
//         System.out.print("Enter message to send: ");
//         String message = scanner.nextLine();

//         // Connect to server
//         Socket socket = new Socket(serverIP, port);
//         OutputStream out = socket.getOutputStream();

//         // Send user input
//         out.write(message.getBytes());
//         System.out.println("Message sent to server.");

//         // Close resources
//         socket.close();
//         scanner.close();
//     }
// }


import java.net.*;
import java.io.*;
import java.util.Scanner;

public class HelloClient {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message to send: ");
        String message = scanner.nextLine();

        Socket socket = new Socket("10.127.19.253", 8080);
        OutputStream out = socket.getOutputStream();

        out.write(message.getBytes());
        System.out.println("Message sent to server.");

        socket.close();
        scanner.close();
    }
}