#!/bin/sh
gradle :say1 :say2 :say3 :say4
gradle tasks --all | grep say
