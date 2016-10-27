# Jump start Java development

Writing programs is hard, that's why a few pointers will break the entry barriers.

## Downloads

- Java: the JDK (Java Development Kit) from Oracle provides everything needed to start developing Java applications. Get it from Oracle (latest version 8u112 at the time of writing) and install it.
- GIT: GIT is the free and widely used version control system used by companies all over the world. On Mac OSX is comes bundles with XCode directly from the AppStore (free).

## JDK

### Compiling

The compiler will translate your `.java` files into `.class` files which can be executed by the JVM. The basic workflow:


1. Verify your Java installation in the Terminal: `java -version`. An output like
    ```
    Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8
    java version "1.8.0_91"
    Java(TM) SE Runtime Environment (build 1.8.0_91-b14)
    Java HotSpot(TM) 64-Bit Server VM (build 25.91-b14, mixed mode)
    ```
    is expected.

2. Create a Java application in a file named the same as class you are implementing:
    ```
    // file: Application.java
    public class Application {

      public static void main(final String[] args) {
        // go and do something crazy, at leat print something
    
        // exit the method cleanly
        System.exit(0);
      }
    }
    ```
3. Compile it: `javac Application.java` (no errors are expected)
4. Run it: `java Application` (no errors or output is expected, as the application does nothing)

## Git

### Why?

- you'll make a lot of errors and CMD + Z / Ctrl + Z won't safe you (`git checkout <tag|branch_name>`, `git branch <branch_name>`)
- you'll have to try finding the correct solution sometime - not everything works right away
- you'll work in groups / teams (`git merge <branch_name>`).

### Where?

The command line at first. Why? Your programs are small and the command line is your friend.

### How?

1. Check your installation: `git --version`. An output like
    ```
    git version 2.8.4 (Apple Git-73)
    ```
    is ecpected.
2. Initialize the GIT repository on the projects home folder:
    ```
    git init .
    ```
