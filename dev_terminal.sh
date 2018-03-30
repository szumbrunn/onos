#!/bin/bash

sleep 60
export ONOS_ROOT=~/work/onos
source $ONOS_ROOT/tools/dev/bash_profile
cd $ONOS_ROOT && tools/test/bin/onos localhost
