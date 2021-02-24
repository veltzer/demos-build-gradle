Gradlew
=======

The purpose of this exercise is to show how you can control the version
of gradle for a project from within the project.

This way you can avoid various users having non identical versions of gradle.

* Create a folder for a project (name it whatever you want)

* Enter the project folder

* Create an empty `build.gradle` file

* Check what is the version of your gradle using:

```bash
gradle -v
```

* run

```shell
gradle wrapper
```

* Note the new files and folders that were created. These you are supposed to add
to your source code.

* Edit the file `gradle/wrapper/gradle-wrapper.properties` and the property `distributionUrl`
to reflect the version of gradle you want for this project.

This version will be the same as your gradle version by default.

Make it different from it.

* Now run:

```shell
./gradlew
```

* What happened? What does this output:

```shell
./gradlew -v
```

* Where do you think this version of gradle was downloaded to? checkout ` ~/.gradle/wrapper/dists`

The idea is that from now on you will use `./gradlew` for all you building needs and stop using the gradle
which is outside your project. If your entire team uses `./gradlew` then they will all be synchronized
as far as gradle version goes.

Another advantage is that now you can upgrade grade simply by editing `gradle/wrapper/gradle-wrapper.properties`
and when people pull your change they will automatically start using the new gradle.
