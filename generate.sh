#!/bin/sh

set -eux

# clean
if [ -d ./src ]; then
  rm -rf ./src
fi

# build
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i https://raw.githubusercontent.com/traPtitech/traQ/master/docs/v3-api.yaml \
    -g java \
    -c /local/config.yaml \
    -o /local/out

mv ./out/src ./src
rm ./src/main/AndroidManifest.xml

rm -rf ./out
