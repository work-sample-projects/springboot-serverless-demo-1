#!/bin/bash
echo "Building docker image using: "
buildah --version
echo ""

buildah bud -t springboot-serverless-demo-1.0.0 .