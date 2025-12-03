package day76_Modern_I_O_Directory_File_Operations;

public class Notes {
    public static void main(String[] args) {

        /*

1.Creating Directories (Single + Multiple Levels)
    createDirectory()

Creates ONE directory. Fails if parent folder missing.

Path dir = Paths.get("D:/data/logs");
Files.createDirectory(dir);

createDirectories()

Creates ALL missing parent folders. Never fails.

Path dir = Paths.get("D:/project/app/logs/2025");
Files.createDirectories(dir);

When to Use?
    Log folders
    Report folders
    Export directories
    Upload directories
    Temporary folders

---------------------------------------------------------------------------


2.Listing All Files in a Directory
There are three master-level ways:

Option 1: Files.list(Path)

Returns a Stream<Path>
Best for simple listing.

Path folder = Paths.get("D:/data");

try (var stream = Files.list(folder)) {
    stream.forEach(System.out::println);
}

simple
Auto closes
Stream features


Option 2: DirectoryStream<Path>
Best for large directories → uses lazy iteration.

Path folder = Paths.get("D:/data");

try (DirectoryStream<Path> ds = Files.newDirectoryStream(folder)) {
    for (Path p : ds) {
        System.out.println(p);
    }
}

Memory efficient
Faster on large folders


Option 3: Listing with Filter
Example: show only .txt files

Path folder = Paths.get("D:/data");

try (DirectoryStream<Path> ds =
         Files.newDirectoryStream(folder, "*.txt")) {

    for (Path p : ds) {
        System.out.println(p);
    }
}


Built-in filtering
Fastest method for file type filtering


----------------------------------------------------------------



3.Walking File Tree Recursively
--------------------------------
Most powerful feature of NIO.2

Files.walk()
Reads ALL files in ALL subfolders.

Path root = Paths.get("D:/project");

try (var stream = Files.walk(root)) {
    stream.forEach(System.out::println);
}

Recursive
Returns every file + directory
Stream-based → powerful filtering


4.Recursively Finding All .txt Files
Real interview-level example

Path root = Paths.get("D:/project");

try (var stream = Files.walk(root)) {
    stream
        .filter(p -> Files.isRegularFile(p))
        .filter(p -> p.toString().endsWith(".txt"))
        .forEach(System.out::println);
}

Why is this powerful?
Because backend apps often need to:
    Scan logs
    Process documents
    Read config files
    Index resources
    Perform batch jobs


5.Advanced Example: Count All Files
long count = Files.walk(Paths.get("D:/project"))
                  .filter(Files::isRegularFile)
                  .count();

System.out.println("Total Files: " + count);

6.Advanced Example: Find Files Larger Than 1 MB
Path root = Paths.get("D:/project");

try (var stream = Files.walk(root)) {
    stream
        .filter(Files::isRegularFile)
        .filter(p -> {
            try { return Files.size(p) > 1024 * 1024; }
            catch (Exception e) { return false; }
        })
        .forEach(System.out::println);
}

7.Advanced Example: Delete Empty Folders
Path root = Paths.get("D:/project");

try (var stream = Files.walk(root)) {
    stream
        .sorted((a, b) -> b.compareTo(a))   // delete children first
        .filter(Files::isDirectory)
        .forEach(p -> {
            try { Files.delete(p); } catch (Exception ignored) {}
        });
}


8.List Only Folders

Files.list(Paths.get("D:/project"))
     .filter(Files::isDirectory)
     .forEach(System.out::println);



9.Find Recently Modified Files (Last 24 Hours)

Path root = Paths.get("D:/project");

try (var stream = Files.walk(root)) {
    stream
        .filter(Files::isRegularFile)
        .filter(p -> {
            try {
                return Files.getLastModifiedTime(p)
                        .toMillis() > System.currentTimeMillis() - 86400000;
            } catch(Exception e) {
                return false;
            }
        }).forEach(System.out::println);
}


10.Real-Time Mini Task: Detect Duplicate File Names

import java.util.*;
import java.nio.file.*;

public class DuplicateFileNames {
    public static void main(String[] args) throws Exception {

        Path root = Paths.get("D:/project");
        Map<String, Integer> map = new HashMap<>();

        try (var stream = Files.walk(root)) {
            stream.filter(Files::isRegularFile).forEach(
                p -> map.merge(p.getFileName().toString(), 1, Integer::sum)
            );
        }

        map.entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .forEach(e -> System.out.println("Duplicate: " + e.getKey()));
    }
}

         */
    }
}
