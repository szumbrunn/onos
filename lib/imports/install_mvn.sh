#!/bin/bash

cd lib/imports/
mvn install:install-file \
   -Dfile=sdn-wise-core-4.0.1-SNAPSHOT.jar \
   -DgroupId=com.github.sdnwiselab \
   -DartifactId=sdn-wise-core \
   -Dversion=4.0.1-SNAPSHOT \
   -Dpackaging=jar \
   -DgeneratePom=true
cd ../..