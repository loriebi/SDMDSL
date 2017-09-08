#!/bin/bash

cat "$1"  | tr -d '\t' | tr -d '\v' | tr -s '\n' | tr -s ' ' |sed '/^\s*$/d' > "xtext.txt"
cat "$2"  | tr -d '\t' | tr -d '\v' | tr -s '\n' | tr -s ' ' |sed '/^\s*$/d' > "xpand.txt"
echo $1
echo $2

colordiff -E -Z -B -b -w "xtext.txt" "xpand.txt"
