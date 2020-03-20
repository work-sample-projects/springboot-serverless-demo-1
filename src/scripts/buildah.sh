#!/bin/bash
echo "Building docker image using: "
buildah --version
echo ""

buildah bud -t springboot-serverless-demo-0.0.1 .