#!/bin/bash
first(){

echo $1
}

sec(){

echo $1

}
echo "line count in the text file kill.txt "
cat kill.txt | wc -l


read sa
grep -n $sa kill.txt


echo $#

if [ $# -gt 1 ]; then
first $1
sec $2
else
echo "please enter greater than 1 commandline arguments"
fi