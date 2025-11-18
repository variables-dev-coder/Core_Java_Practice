package day74_Modern_I_O_NIO2;

public class Notes {
    public static void main(String[] args) {


        /*

Introduction to NIO.2
=====================

1. Why java.nio.file is better than old java.io
-----------------------------------------------

| Old java.io                    | New java.nio.file (NIO.2)          |
| ------------------------------ | ---------------------------------- |
| Not scalable                   | Highly scalable & efficient        |
| Blocking I/O                   | Supports non-blocking I/O          |
| Limited exceptions             | Improved error handling            |
| Works with File class only     | Works with Path, Files, FileSystem |
| No symbolic links              | Full native OS support             |
| Hard to copy/move              | Copy/Move/Delete in one line       |
| No built-in file attribute API | Complete file attribute access     |


In short:

NIO.2 is modern, powerful, safe, efficient → used in all enterprise systems today.


2. Key Classes
--------------
Path
Represents filesystem path (file or directory) in an OS-independent way.

Paths
Factory class → creates Path objects.

Files
Utility class → operations like:
Files.exists()
Files.copy()
Files.move()
Files.delete()
Files.readAllLines()
Files.write()
Files.isDirectory()
Files.isRegularFile()
and many more…


3. Relative vs Absolute Paths
-----------------------------
Absolute Path
Full path starting from root:
    Windows → C:/Users/Munna/data.txt
    Linux/Mac → /home/munna/data.txt

Relative Path
Relative to your project folder:
    data.txt
    files/sample.txt
    ../config/settings.json

Rule:
Absolute path = fixed location
Relative path = flexible, portable, recommended for projects


4. Creating Path Instances
--------------------------
Example 1: Absolute path

Path path1 = Paths.get("C:/Users/Munna/Desktop/test.txt");

Example 2: Relative path

Path path2 = Paths.get("data/myfile.txt");

Example 3: Using multiple segments

Path path3 = Paths.get("data", "images", "logo.png");

Example 4: Getting parent/filename

System.out.println(path2.getFileName());
System.out.println(path2.getParent());


5. Checking File Existence & Attributes
---------------------------------------
Check if file exists

Path p = Paths.get("data/info.txt");

if (Files.exists(p)) {
    System.out.println("File exists!");
} else {
    System.out.println("File does not exist.");
}


Check if directory

if (Files.isDirectory(p)) {
    System.out.println("It's a directory");
}


Check if it’s a regular file

if (Files.isRegularFile(p)) {
    System.out.println("It's a normal file");
}


Check if file is readable, writable, executable

Files.isReadable(p);
Files.isWritable(p);
Files.isExecutable(p);


Top Backend Developer Insights
-------------------------------
Path replaces File because it is more powerful + more accurate.
Files class gives complete file system control.
Relative paths make your code portable across environments (local → QA → Prod).
NIO.2 works smoothly with streams, channels, directory walking, and async I/O.




1. Check if file exists, otherwise create it (used in logging, config loading)

Path p = Paths.get("logs/app-log.txt");

if (Files.notExists(p)) {
    Files.createDirectories(p.getParent());  // create /logs if not exist
    Files.createFile(p);
}
System.out.println("File ready: " + p.toAbsolutePath());


2.Read all lines of a file (reading config files, templates, JSON files)

Path p = Paths.get("config/settings.json");
List<String> lines = Files.readAllLines(p);

lines.forEach(System.out::println);


3.Write content to a file (logging, exporting reports, writing data)

Path p = Paths.get("output/report.txt");
Files.write(p, Arrays.asList("Sales Report", "Date: Today"));


4.Copy a file (used for backups, uploads, exports)

Files.copy(
    Paths.get("data/file.txt"),
    Paths.get("backup/file_backup.txt"),
    StandardCopyOption.REPLACE_EXISTING
);


5.Move a file (used in file-processing pipelines)

Files.move(
    Paths.get("incoming/order.csv"),
    Paths.get("processed/order.csv"),
    StandardCopyOption.REPLACE_EXISTING
);


6.Delete a file safely (cleanup tasks, cron jobs)

Path p = Paths.get("temp/cache.tmp");

if (Files.exists(p)) {
    Files.delete(p);
}


7.Check file size (used for validating uploads)

Path p = Paths.get("uploads/image.jpg");
long size = Files.size(p);

System.out.println("File size: " + size + " bytes");


8.List all files inside a directory (log folder scanning, job schedulers)

Path folder = Paths.get("data");

Files.list(folder)
    .forEach(path -> System.out.println(path.getFileName()));


9.Find only .txt files inside directory (filtering, ETL, batch jobs)

Files.list(Paths.get("documents"))
     .filter(p -> p.toString().endsWith(".txt"))
     .forEach(System.out::println);


10.Create nested directories (used in file upload APIs, media storage)

Path folder = Paths.get("uploads", "users", "2025", "photos");

Files.createDirectories(folder);

System.out.println("Folder ready at: " + folder.toAbsolutePath());

         */
    }
}
