#!/bin/sh

set -eux

# clean
if [ -d ./src ]; then
  FILES=$(find ./src -type f)
  echo $FILES | xargs rm
fi

# build
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i https://raw.githubusercontent.com/traPtitech/traQ/master/docs/v3-api.yaml \
    -g java \
    -o /local/out

mv ./out/src ./src

rm -rf ./out
