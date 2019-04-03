#!/bin/bash

echo "line count in the text file "kill.txt" "
cat "kill.txt" | wc -l


read sa
grep -n $sa kill.txt

read a
read b

first(){

echo $a
}

sec(){

echo $b

}

if [ $a =="hello" ]; then
first
else
sec
fi






