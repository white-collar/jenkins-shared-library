#!/usr/bin/env groovy
package com.example


class Docker implements Serializible {

    def script

    Docker(script) {
        this.script() = script()
    }

    def buildDockerImage(String imageName) {
        script.echo "building the docker image ..."
        script/withCredentials([script.usernamePassword(credentialsId: 'fe0a4b7c-4e6b-48fb-8744-585d873a4b10', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        script.sh "docker build -t $imageName ."
        script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin"
        script.sh "docker push $imageName"
    }

}
