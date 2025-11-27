package day75_Modern_I_O_Reading_Writing_Files;

public class Notes {
    public static void main(String[] args) {

        /*

Topic: Reading & Writing Files
Package: java.nio.file
Main classes:
    Path
    Paths
    Files

PART 1: Reading Files
---------------------
1. Read Entire File
Method: Files.readAllLines(Path path)
    Reads entire file into memory
    Returns List<String>
    Best for smaller text files.

Example

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class ReadExample {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("data.txt");

        List<String> lines = Files.readAllLines(filePath);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}


Dry Run
File: data.txt

Hello
Welcome
Java NIO is fast!


Program executes:
    Path: data.txt
    Reads 3 lines → stored as list
        ["Hello", "Welcome", "Java NIO is fast!"]
    Prints each line.

===========================================================================


PART 2: Writing Files
---------------------
2. Write to a File
Method: Files.write(Path, byte[] or List<String>)

Example

import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;

public class WriteExample {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("notes.txt");

        Files.write(file, Arrays.asList("Line 1", "Line 2"));
    }
}

Output
Creates file notes.txt with:

==========================================================================


PART 3: Appending File Content
------------------------------
3. Append text
--------------
Use StandardOpenOption.APPEND

import java.nio.file.*;
import java.io.IOException;

public class AppendExample {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("notes.txt");

        Files.write(file,
                "New Line Added\n".getBytes(),
                StandardOpenOption.APPEND);
    }
}

Output added at bottom:

Line 1
Line 2
New Line Added


PART 4: Copy Files
-------------------
4. Copy File
Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING)

Path src = Paths.get("notes.txt");
Path dest = Paths.get("backup_notes.txt");

Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);


If file exists → replaces it
Used in backup utilities, log rotation, file upload handling


PART 5: Move (Rename) Files
---------------------------
5. Move File
Files.move(src, dest)

Path oldFile = Paths.get("notes.txt");
Path newFile = Paths.get("notes-renamed.txt");

Files.move(oldFile, newFile, StandardCopyOption.REPLACE_EXISTING);


Can rename
Can move to another folder
Can be used to archive logs or organize uploads


PART 6: Delete Files
--------------------
6. Delete File
Files.delete(path)
Throws error if file doesn't exist.

safer option:

Files.deleteIfExists(path)

Path p = Paths.get("old.txt");

if (Files.deleteIfExists(p)) {
    System.out.println("Deleted");
} else {
    System.out.println("File not found");
}



Real-Time Scenario
------------------
Build a Log Manager
A real backend system has:
    error.log
    info.log
    app.log

Using NIO.2:
    1.Read logs
    2.Append new log messages
    3.Copy → create rotation backup
    4.Move → archive
    5.Delete old logs

Companies like Netflix, Uber, Amazon use NIO.2-style non-blocking I/O for performance.


         */
    }
}
