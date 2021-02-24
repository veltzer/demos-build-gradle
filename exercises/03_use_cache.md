Using the cache exercise
========================

The purpose of this exercise is to see the Gradle cache in action.

* Start with a simply java program (copy from previous exercises).

* See that you can build it with gradle and that is runs.

* Turn on the grade caches by putting in gradle.properties:
```
org.gradle.caching=true
```

* Now run a first build with
```shell
gradle -i build
```

* Remove the `build` folder with:
```shell
gradle clean
```

* Rebuilt with:
```shell
gradle -i build
```

* What did you see?

* Where do you think the cache is?

* Hint: `~/.gradle/cache/build-cache-XXXX`

* Now repeat the exercise but this time remove the cache between the two builds.

* Now can you look into the cache directory and explain how it works?
