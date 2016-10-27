# Jump start Java development

Writing programs is hard, that's why a few pointers will break the entry barriers.

## Downloads

- Java: the JDK (Java Development Kit) from Oracle provides everything needed to start developing Java applications. Get it from Oracle (latest version 8u112 at the time of writing) and install it.
- GIT: GIT is the free and widely used version control system used by companies all over the world. On Mac OSX is comes bundles with XCode directly from the AppStore (free).

### JDK

#### Compiling

The compiler will translate your `.java` files into `.class` files which can be executed by the JVM. The basic workflow:

1. Create a Java application in a file named the same as class you are implementing:

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
2. Compile it: `javac Application.java`
3. Run it: `java Application`
