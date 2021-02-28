
Write two gradle tasks.

Both tasks receive a parameter called "src_dir" which is the source code
folder that they both will work on.

You need to decide to how to pass this parameter to both tasks.
	(two options: either a parameter to the class constuctor
	or closure?)

Task number 1:
recursively traverse the source folder and output a file called "line_numbers.txt"
	which has the structure: "<source_file> <line_number>" for each source file.

Task number 2:
Run a check on all source files to check that they DONT contain a set of regexps
(the set of regexps is paramter to be determined by the user)
If this task finds the regexp in any of the source files, it should fail.

Example: I will pass this -> ["c:\\temp", ...] to your task and it will check
	that no source file has this in it.

General requirements:
- Make both tasks depend on the java compilation.
- Make a task that depends on both of these tasks


				Java compilation task
				| 			 |
				|			 |
			task 1				task 2

				\			/
				 \	       	       /
				  \		      /
				   \		     /
					full_build

