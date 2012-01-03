#!/bin/bash 

mvn deploy:deploy-file \
-Durl=https://maven-android-archetype.googlecode.com/svn/repository \
-DrepositoryId=mavenAndroid \
-Dfile=device.png \
-DgroupId=images \
-DartifactId=device \
-Dversion=2 \
-Dpackaging=png 
