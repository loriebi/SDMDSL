#!/bin/bash

for i in $(ls $1)
do
  echo $i
  colordiff -E -Z -B -b -w "$1/$i" "$2/$i"
done
