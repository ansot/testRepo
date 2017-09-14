#!/bin/sh

set -eu

./source-code/tasks/generate-settings.sh


echo "Calling Maven ..."
mvn verify