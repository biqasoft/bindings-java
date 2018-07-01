#!/usr/bin/env bash

# require maven, xmlstarlet
# linux: apt-get install xmlstarlet
# windows: https://freefr.dl.sourceforge.net/project/xmlstar/xmlstarlet/1.6.1/xmlstarlet-1.6.1-win32.zip

set -e

# set parent version of each module to the latest base module
find . -name 'pom.xml' | while read line; do
    xmlstarlet ed --inplace -N p=http://maven.apache.org/POM/4.0.0 -u "/p:project/p:parent/p:version" -v ${PROJECT_VERSION} ${line}
    echo "Processing module '$line'"
done

mvn clean install