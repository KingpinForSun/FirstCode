package com.msb.test06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        String str = "abcÄãºÃ£¡";
        File f = new File("E:\\download\\demo.txt");

        FileWriter fw = new FileWriter(f);
        fw.write(str);
        fw.close();
    }
}
