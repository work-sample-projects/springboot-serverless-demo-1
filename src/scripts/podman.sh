#!/bin/bash
echo "Running image using podman"

podman run -p 8080:8080 springboot-serverless-demo-1.0.0