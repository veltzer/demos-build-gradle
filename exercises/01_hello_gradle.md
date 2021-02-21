Hello Gradle exercise
=====================

* Make sure you have gradle installed

```shell
gradle -v
```

* create a folder for your project

* enter that folder

* create a java file called HelloWorld.java residing in a folder structure like so:
└── src
    └── main
        └── java
            └── hello
                └── HelloWorld.java

with the following content:

```java
package hello;

public class HelloWorld {
        public static void main(String[] args) {
                System.out.println("Hello, World!");
        }
}
```

* try to compile it by standing in the project root and issueing:

```shell
gradle
```
or 
```
gradle build
```

Old versions of gradle did compile this but new ones don't.

* add a file called `build.gradle` with the following content:

```gradle
apply plugin: 'java'
```

and issue again:

```shell
gradle build
```

* now that the build worked register what changed in the folder.

* run you appliction:

```shell
java -classpath build/classes/java/main hello.HelloWorld
```
