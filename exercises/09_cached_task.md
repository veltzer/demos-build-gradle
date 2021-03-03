
* Build a task that takes two files as input
(by default one.txt and two.txt)
and creates a third file (three.txt)
which is a concatenation of the two files.

* Write your task in the "class paradigm"
(write it like a class with decorators and register using tasks.register)

* Now make your class cachable.
- put the right decorator on your class
- to correctly "tell gradle" what your inputs and output are
	(just use the right decorators)

* see indeed, that when the files one.txt and two.txt do not change, your task
doesn't get run and gradle show you that it gets the output from the cache.

* If you want to see this in action you must define:
org.gradle.caching=true
org.gradle.caching.debug=true
in gradle.propeties 
