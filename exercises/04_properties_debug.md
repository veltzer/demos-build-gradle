Working with gradle.properties
==============================

This exercise is here to familiarize you with `gradle.properties`

* start with an empty folder and with an empty `build.gradle`

* add the property
```
foo=bar
```
in `~/.gradle/gradle.properties`

* issue:
```shell
gradle :properties
```
or
```shell
gradle :properties | grep foo
```

* now overwrite this with the following in `./gradle.properties`
```
foo=baz
```

* check the properties again.

* Note that you can put anything in the properties file with no checking by gradle.
