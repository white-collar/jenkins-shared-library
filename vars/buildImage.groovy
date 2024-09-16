#!/usr/bin/env groovy

def call() {
    echo "building the docker image ..."
    withCredentials([usernamePassword(credentialsId: 'fe0a4b7c-4e6b-48fb-8744-585d873a4b10', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t jeston/demo-app:jma-1.7.8 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push jeston/demo-app:jma-1.7.8'
    }