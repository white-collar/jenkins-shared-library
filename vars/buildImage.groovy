#!/usr/bin/env groovy

import com.example

def call(String imageName) {
    // echo "building the docker image ..."
    // withCredentials([usernamePassword(credentialsId: 'fe0a4b7c-4e6b-48fb-8744-585d873a4b10', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    //     sh "docker build -t $imageName ."
    //     sh "echo $PASS | docker login -u $USER --password-stdin"
    //     sh "docker push $imageName"
    // }

    return new Docker(this).buildDockerImage(imageName)
}