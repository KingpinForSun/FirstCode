package com.msb.test09;

import java.io.*;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws IOException {
        System.out.println("�ͻ�������");
        Socket s = new Socket("192.168.1.3",8888);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF("��÷����������ǿͻ���");

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String s1 = dis.readUTF();
        System.out.println("����������˵"+s1);
        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
    }
}
