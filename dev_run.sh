#!/bin/bash

export ONOS_ROOT=.
source $ONOS_ROOT/tools/dev/bash_profile

./lib/imports/install_mvn.sh

cd $ONOS_ROOT && tools/build/onos-buck clean && tools/build/onos-buck build onos --show-output && tools/build/onos-buck run onos-local -- clean debug


