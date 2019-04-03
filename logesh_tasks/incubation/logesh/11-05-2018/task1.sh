#!/bin/sh

#creating a directory tomcat.

mkdir -p TOMCAT
# getting resources
wget  http://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.8/bin/apache-tomcat-9.0.8.zip
#renaming
mv apache-tomcat-9.0.8.zip tomcat9.zip
#getting resources
wget http://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.8/src/apache-tomcat-9.0.8-src.zip
#renaming
mv apache-tomcat-9.0.8-src.zip tomcat9_src.zip
#Creating Zips directory
mkdir -p ./TOMCAT/ZipsDirectory
#unzipping
    unzip tomcat9_src.zip -d ./TOMCAT
    unzip tomcat9.zip -d ./TOMCAT
    

#moving zips to the Zips directory
mv tomcat9_src.zip ./TOMCAT/ZipsDirectory
mv tomcat9.zip ./TOMCAT/ZipsDirectory

#removing misc
rm -r C:\Users\Administrator\Desktop\shell\TOMCAT\apache-tomcat-9.0.8\webapps\examples\jsp\jsp2\misc


#compiling java files
mkdir -p classes
javac ./src/*.java -d classes
javac ./src/lol/*.java -d classes
#making jar
jar cvf tomcat9_src.jar ./classes
cp tomcat9_src.jar ./TOMCAT/apache-tomcat-9.0.8/lib
cd TOMCAT
#making zip file
zip -r apache-tomcat-9.0.8_new.zip  ./apache-tomcat-9.0.8
mkdir -p output
#moving zip file to output
mv *.zip output
