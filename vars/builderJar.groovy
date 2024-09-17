#!/usr/bin/env groovy

def call() {
    echo "Building app for branch $BRANCH_NAMR"
    sh 'mvn package'
}