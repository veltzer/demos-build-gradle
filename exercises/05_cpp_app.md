C plus plus application using Gradle
====================================

The purpose of this exercise is to show you how to build your first
C++ application with gradle

* Start with a clean grade build folder

* Add the following C++ code as part of your project under the file
name `src/main/cpp/hello.cc`:

```C++
#include <iostream>

int main(int argc, char** argv, char** envp) {
	std::cout << "Hello, World!" << std::endl;
	return EXIT_SUCCESS;
}
```

* Add the following `build.gradle` file:
```Groovy
plugins {
	id 'cpp-application'
}
```

* Build you project:
```shell
gradle build
```

* What happened? What do understand from this about gradle's default regarding C++ building?

* Can you run your application?

* Can you build a release version?
