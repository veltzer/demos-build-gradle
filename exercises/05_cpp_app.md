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

* Advanced: take the following code and try to make gradle compile it:
```C++
#include <iostream>	// for std::cout
#include <string>	// for std::string
#include <sigc++/sigc++.h>
#include <stdlib.h>	// for EXIT_SUCCESS

/*
 * This is a demo program for using the sigc++ signaling library
 *
 * EXTRA_COMPILE_CMDS=pkg-config --cflags sigc++-2.0
 * EXTRA_LINK_CMDS=pkg-config --libs sigc++-2.0
 */

void on_print(const std::string& str) {
	std::cout << str;
}

int main(int argc, char** argv, char** envp) {
	sigc::signal<void, const std::string&> signal_print;
	signal_print.connect(sigc::ptr_fun(&on_print));
	signal_print.emit("hello world\n");
	return EXIT_SUCCESS;
}
```

* Hint: look at the code, it shows you the extra flags to link and to compile.

* Hint: you also need to install the relevant library.
