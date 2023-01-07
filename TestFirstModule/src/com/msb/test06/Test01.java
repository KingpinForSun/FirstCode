package com.msb.test06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\download\\test.txt");
        FileReader fr = new FileReader(f);
        int n1 = fr.read();

        System.out.println(n1);
        fr.close();
    }
}
