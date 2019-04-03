#!/bin/sh
# Hard cored all links to variables.
link1=http://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.8/bin/apache-tomcat-9.0.8.zip
link2=http://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.8/bin/apache-tomcat-9.0.8.tar.gz
link3=http://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.8/bin/apache-tomcat-9.0.8.exe
link4=http://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.7/bin/apache-tomcat-9.0.7.zip
link5=http://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.7/bin/apache-tomcat-9.0.7.tar.gz
link6=http://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.7/bin/apache-tomcat-9.0.7.exe

# function for downloading files using forloop
download()
{
    for i in  $link1 $link2 $link3 $link4 $link5 $link6; do
    wget $i
    done
}

# creating directory
mkdir TOMCAT
# downloading files using parallel.
wget $link1 &
wget $link2 &
wget $link3 &
wget $link4 &
wget $link5 &
wget $link6 &

wait

# moving zips to zipparallel.
mkdir ./TOMCAT/Zips_parallel

mv ./*.zip ./TOMCAT/Zips_parallel
mv ./*.tar.gz ./TOMCAT/Zips_parallel
echo "For Downloading"
#calling function download for downloading files using forloop
download

# moving zips to zips_fordirectory.
mkdir TOMCAT/Zips_fordirectory

mv ./*.zip ./TOMCAT/Zips_fordirectory
mv ./*.tar.gz ./TOMCAT/Zips_fordirectory

# listing files in the directory and creating a document of listed files.
ls
ls -1 -LR > ls.txt


# creating and moving the document to output directory.
mkdir output
mv ls.txt output
 
mv output ./TOMCAT

#zipping everything excluding output directory
zip -r tomcat_binaries.zip ./TOMCAT  -x ./TOMCAT/'*output/*'



#moving the zip to output

mv tomcat_binaries.zip ./TOMCAT/output

    
