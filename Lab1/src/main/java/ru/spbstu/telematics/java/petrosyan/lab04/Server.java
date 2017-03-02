package ru.spbstu.telematics.java.petrosyan.lab04;

/**
 * Created by hamle_000 on 2/3/2017.
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public final static int SOCKET_PORT = 13267;  // you may change this
    public final static String FILE_TO_SEND = "D:/a.jpg";  // you may change this

    public static void main (String [] args ) throws IOException {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        OutputStream os = null;
        ServerSocket servsock = null;
        Socket sock = null;
        try {
            servsock = new ServerSocket(SOCKET_PORT);
            while (true) {
                System.out.println("Waiting...");
                try {
                    sock = servsock.accept();
                    System.out.println("Accepted connection : " + sock);
                    // send file
                    File myFile = new File (FILE_TO_SEND);
                    byte [] mybytearray  = new byte [(int)myFile.length()];
                    fis = new FileInputStream(myFile);
                    bis = new BufferedInputStream(fis);
                    bis.read(mybytearray,0,mybytearray.length);
                    os = sock.getOutputStream();
                    System.out.println("Sending " + FILE_TO_SEND + "(" + mybytearray.length + " bytes)");
                    os.write(mybytearray,0,mybytearray.length);
                    os.flush();
                    System.out.println("Done.");
                }
                finally {
                    if (bis != null) bis.close();
                    if (os != null) os.close();
                    if (sock!=null) sock.close();
                }
            }
        }
        finally {
            if (servsock != null) servsock.close();
        }
    }
}
/*
import java.io.*;
import java.net.*;


public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Server side");
        BufferedReader in = null;
        PrintWriter out = null;

        BufferedOutputStream outToClient = null;


        ServerSocket servers = null;
        Socket fromclient = null;

        // create server socket
        try {
            servers = new ServerSocket(4444);

        } catch (IOException e) {
            System.out.println("Couldn't listen to port 4444");
            System.exit(-1);
        }

        try {
            System.out.print("Waiting for a client...");
            fromclient = servers.accept();
            outToClient = new BufferedOutputStream(fromclient.getOutputStream());
            System.out.println("Client connected");
        } catch (IOException e) {
            System.out.println("Can't accept");
            System.exit(-1);
        }

        */
/*in = new BufferedReader(new
                InputStreamReader(fromclient.getInputStream()));
        out = new PrintWriter(fromclient.getOutputStream(), true);
        String input, output;

        System.out.println("Wait for messages");
        while ((input = in.readLine()) != null) {
            if (input.equalsIgnoreCase("exit")) break;
            out.println("S ::: " + input);
            System.out.println(input);
        }*//*


        File myFile = new File("D:\\a.jpg");
        byte[] mybytearray = new byte[(int) myFile.length()];

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(myFile);
        } catch (FileNotFoundException ex) {
            // Do exception handling
        }
        BufferedInputStream bis = new BufferedInputStream(fis);

        try {
            System.out.println("Uploading...");
            bis.read(mybytearray, 0, mybytearray.length);
            outToClient.write(mybytearray, 0, mybytearray.length);
            outToClient.flush();
            outToClient.close();
            //connectionSocket.close();

            // File sent, exit the main method
            return;
        } catch (IOException ex) {
            // Do exception handling
        }
        out.close();
        in.close();
        fromclient.close();
        servers.close();
    }
}*/
