package com.nc.autumn2020;

import java.nio.channels.ScatteringByteChannel;
import java.nio.file.*;
import java.io.*;
import java.util.*;


public class additional {
    public static void main(String[] args) {
        File file = new File("D:\\ncEdu\\ncEducation2020\\src\\main\\java\\" +
                "com\\nc\\autumn2020\\tasks\\additional\\decript\\Bilousaa");



        try{
            InputStream input = new BufferedInputStream(new FileInputStream(file));
            byte[] buffer = new byte[input.available()];
            input.read(buffer,0, input.available());


            byte[] data = Base64.getDecoder().decode(buffer);
            OutputStream stream = new FileOutputStream("c:/abc.png");
            stream.write(data);
        }
        catch(Exception e){
            System.out.println(e);
        }
}
}
