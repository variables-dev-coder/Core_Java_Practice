package day75_Modern_I_O_Reading_Writing_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex10_FileDetails {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/FileDetails.txt");

        BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("Size: " + attrs.size());
        System.out.println("Is Directory: " + attrs.isDirectory());
        System.out.println("Created: " + attrs.creationTime());
        System.out.println("Last Modified: " + attrs.lastModifiedTime());
    }
}


//Size: 18
//Is Directory: false
//Created: 2025-11-27T10:39:16.9132747Z
//Last Modified: 2025-11-27T10:40:15.9803751Z


//Explanation
//Shows all main metadata of the file (size, timestamps, etc.).