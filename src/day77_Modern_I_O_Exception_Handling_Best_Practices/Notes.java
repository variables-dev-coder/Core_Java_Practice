package day77_Modern_I_O_Exception_Handling_Best_Practices;

public class Notes {
    public static void main(String[] args) {

        /*

1. Handling IOException Properly
--------------------------------
IOException is the most common exception in I/O operations.

Why does IOException occur?
    File not found
    Access denied
    Disk full
    File locked by another process
    Path incorrect
    Network I/O failure
    Directory does not exist

Bad practice

try {
    Files.readAllLines(Path.of("data.txt"));
} catch (IOException e) {
    e.printStackTrace(); // Never use this in real projects
}

Why is e.printStackTrace() bad?
    No user-friendly message
    Not logged
    Not handled
    Fails silently in production
    Security risk — prints full file path

Best practice

try {
    Files.readAllLines(Path.of("data.txt"));
} catch (IOException e) {
    System.err.println("Error reading file: " + e.getMessage());
    // OR use logger in real project
}

Best practice with logger (real-world)

private static final Logger log = LoggerFactory.getLogger(Main.class);

try {
    Files.readAllLines(Path.of("data.txt"));
} catch (IOException e) {
    log.error("Failed to read file", e);
}


2. Try-With-Resources (TWR)
---------------------------
TWR automatically closes resources like:
    FileReader
    BufferedReader
    InputStream
    OutputStream
    Channels
    DirectoryStream

Why TWR is necessary?

Without closing resources:
    File becomes LOCKED
    Memory leak
    Stream corruption
    OS file-handle leak

Try-with-resources Example (Modern Java)

Path path = Path.of("sample.txt");

try (BufferedReader br = Files.newBufferedReader(path)) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.err.println("Failed to read file: " + e.getMessage());
}


Automatically closes BufferedReader
No need for finally block
Cleaner, safer, modern

OLD STYLE (Avoid)

BufferedReader br = null;

try {
    br = new BufferedReader(new FileReader("sample.txt"));
} finally {
    if (br != null) {
        br.close(); // messy & easy to forget
    }
}


3. Common Pitfalls & Performance Tips (PRO Level)
--------------------------------------------------
Pitfall 1: Using Files.readAllLines() for large files

Files.readAllLines() loads entire file into memory.

Good for small files
Bad for 1–10GB logs

Use streaming instead

try (Stream<String> lines = Files.lines(Path.of("bigfile.txt"))) {
    lines.forEach(System.out::println);
}


Pitfall 2: Creating too many File Streams

Opening + closing = expensive OS operations.

Reuse streams
Use buffer (BufferedReader / BufferedWriter)


Pitfall 3: Forgetting file existence checks

Always check before reading/writing:

Path path = Path.of("data.txt");

if (!Files.exists(path)) {
    System.out.println("File missing!");
}


Pitfall 4: Writing without specifying StandardOpenOption

Best practice:

Files.write(path, msg.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);


Pitfall 5: Hardcoding file paths

NEVER DO THIS

C:\Users\Munna\Desktop\file.txt


Instead use:

Path path = Paths.get("file.txt");



4. Real-Time Best Practices (Senior Developer Level)
-------------------------------------------------------
Always use Path + Files
    NEVER use legacy:
    FileInputStream
    FileOutputStream
    FileReader
    FileWriter

Use:

Files.newBufferedReader()
Files.newBufferedWriter()
Files.newInputStream()
Files.newOutputStream()

Prefer Files.walk() for directory traversal
Not manual recursive code.

Always log exceptions
Never ignore.

Use UTF-8 explicitly
Avoid platform-dependent default encoding.

Files.newBufferedReader(path, StandardCharsets.UTF_8);



5. TOP 6 Real-World Scenarios
-----------------------------
Log Reader
Stream lines using Files.lines().

Backup Tool
Copy files with Files.copy().

Folder Scanner
Find all .log files with Files.walk().

Cleanup Script
Delete old temp files using Files.delete().

Config Loader
Read config using UTF-8 buffered reader.

Download Manager
Write chunks using buffered output streams.


         */
    }
}
