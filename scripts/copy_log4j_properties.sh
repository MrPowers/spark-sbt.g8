#!/usr/bin/env bash

DESTINATION_ROOT_DIR=$1
if [ "$DESTINATION_ROOT_DIR" = "" ]
  then
    echo "The destination root directory variable must be set"
    exit 1
fi

mkdir $DESTINATION_ROOT_DIR/src/test/resources
cp scripts/log4j.properties $DESTINATION_ROOT_DIR/src/test/resources/log4j.properties