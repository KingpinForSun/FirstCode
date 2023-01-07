package com.msb.test09;

import java.io.*;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        Socket s = new Socket("192.168.1.3",8888);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF("你好服务器，我是客户端");

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String s1 = dis.readUTF();
        System.out.println("服务器对我说"+s1);
        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
    }
}
