#!/bin/sh

set -eu

./source-code/tasks/generate-settings.sh

cd source-code
echo "Calling Maven ..."
mvn verify