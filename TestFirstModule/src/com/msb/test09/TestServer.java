package com.msb.test09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        System.out.println("������������");
        ServerSocket ss = new ServerSocket(8888);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        String str = dis.readUTF();
        System.out.println(str);

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF("��ã��ͻ��ˣ��ҽ��ܵ������Ϣ��");
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
