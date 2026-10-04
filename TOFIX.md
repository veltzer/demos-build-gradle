# TOFIX

Findings from a code scan on 2026-10-04.

## Medium

- `examples/sig_on_gradle_files/run.sh:2` - runs `gradle :combine`, but this example only registers `only_output_task` (`onlyoutputtask.gradle:12`), so the script fails with "task 'combine' not found" (it was copied from `exercises/09_cached_task/run.sh`); run `gradle :only_output_task`.
- `examples/java_basic/run.sh:3` - runs `build/libs/java_basic-1.1.jar`, but `settings.gradle:1` sets `rootProject.name="basic_java"`, so the jar is `basic_java-1.1.jar` and the command fails; fix the jar name (the trailing `hello.HelloWorld` argument is also redundant with `-jar`).
- `examples/java_config/build.gradle:10` - `application { mainClassName = ... }` was deprecated in Gradle 7 and removed in Gradle 8, so the example fails on a current Gradle (and `gradle.properties:1` sets `org.gradle.warning.mode=none`, which hid the deprecation warning); use `mainClass = javaMainClass`.
- `examples/gradlew/gradlew:83` - the wrapper example cannot run: `gradle/wrapper/gradle-wrapper.jar` is not committed (the fleet `.gitignore:100` ignores `*.jar`), so `./gradlew` fails to load `GradleWrapperMain`; force-add the jar (`git add -f`), and rename the empty `examples/gradlew/gradle.build` to `build.gradle`. Gradle 6.8.2 (`gradle-wrapper.properties:3`) is also far behind; regenerate with `gradle wrapper`.
- `examples/dotnet_app/build.gradle:5` - `id 'io.freefair.dotnet'` in a `plugins {}` block with no `version` and no `pluginManagement` in `settings.gradle`, so Gradle cannot resolve the plugin and the build fails at configuration; the referenced `MyDotNetApp.csproj` (line 16) also does not exist (the source is `src/main/cs/Program.cs`); make it work or remove the example.
- `exercises/10_cpp_with_libs/hellosigc.cc:19` - `#include <firstinclude.h>` is a header from the linuxapi repo that does not exist here, so the file cannot be compiled as the exercise asks; remove the include (the copy in `exercises/05_cpp_app.md:41` already omits it). The exercise README (`README.md:5`) is still "TBD".

## Low

- `exercises/03_use_cache.md:34` - the hint path `~/.gradle/cache/build-caches-XXXX` is wrong; the local build cache lives in `~/.gradle/caches/build-cache-1`.
- `exercises/09_cached_task/README.md:4` - the exercise asks for `one.txt`/`two.txt` -> `three.txt`, while the solution in `build.gradle:25` uses `filename1.txt`/`filename2.txt` -> `output.txt`; align them. Also "gradle.propeties" typo on line 22.
- `exercises/08_two_tasks_with_dependencies/count_lines.txt` - generated outputs (`count_lines.txt` from the `count_lines` task, `count_output.txt` from `count_lines_recursive.groovy`; likewise `examples/custom_simple_task/count.txt`) are committed; delete them and add them to the local `.gitignore`.
