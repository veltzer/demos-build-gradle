#!/bin/sh
gradle :say1 :say2 :say3
gradle tasks --all | grep say
