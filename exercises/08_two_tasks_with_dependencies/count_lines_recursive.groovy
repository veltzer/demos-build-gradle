#!/usr/bin/groovy

import groovy.io.FileType


def count_number_of_lines(file) {
	counter = 0
	file.eachLine {
		counter += 1
	}
	return counter
}
// println count_number_of_lines(new File("/etc/passwd"))

def scan_folder(folder_name, output_filename) {
	def dir = new File(folder_name)
	def output_file = new File(output_filename)
	output_file.delete()
	dir.eachFileRecurse (FileType.FILES) {
		output_file << "${it} ${count_number_of_lines(it)}\n"
	}
}

scan_folder("src", "count_output.txt")
