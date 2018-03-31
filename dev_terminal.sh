#!/bin/bash

export ONOS_ROOT=~/onos
source $ONOS_ROOT/tools/dev/bash_profile
cd $ONOS_ROOT && tools/test/bin/onos localhost
