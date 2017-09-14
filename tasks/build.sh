#!/bin/sh

set -eu
ls
./source-code/tasks/generate-settings.sh


echo "Calling Maven ..."
mvn verify