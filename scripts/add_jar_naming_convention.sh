#!/usr/bin/env bash

BUILD_FILE=$1
if [ "$BUILD_FILE" = "" ]
  then
    echo "The build file variable must be set"
    exit 1
fi

line='assemblyJarName in assembly := s"${name.value}_${scalaBinaryVersion.value}-${sparkVersion.value}_${version.value}.jar"'
echo $line >> $BUILD_FILE