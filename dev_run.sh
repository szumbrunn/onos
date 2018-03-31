#!/bin/bash

export ONOS_ROOT=~/onos
source $ONOS_ROOT/tools/dev/bash_profile

gnome-terminal -- ./dev_terminal.sh
cd $ONOS_ROOT && tools/build/onos-buck clean && tools/build/onos-buck build onos --show-output && tools/build/onos-buck run onos-local -- clean debug


