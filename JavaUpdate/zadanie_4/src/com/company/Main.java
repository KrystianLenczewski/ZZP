package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
	    Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Path filePath3 = Files.createTempFile("file3", ".txt");

        Files.writeString(filePath1,"Ala ma kota");
        Files.writeString(filePath2,"Ala ma kota");
        Files.writeString(filePath3,"Ala ma");
        
        System.out.println(Files.readString(filePath1));
        System.out.println(Files.readString(filePath2));
        System.out.println(Files.readString(filePath3));

        long mismatch1 = Files.mismatch(filePath1, filePath2);
        long mismatch2 = Files.mismatch(filePath1, filePath3);
        System.out.println(mismatch1);
        System.out.println(mismatch2);

        filePath1.toFile().deleteOnExit();
        filePath2.toFile().deleteOnExit();
        filePath3.toFile().deleteOnExit();
    }
}
