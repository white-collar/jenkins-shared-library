#!/usr/bin/env groovy
import com.example.Docker.Docker


def call(String imageName) {
    return new Docker(this).dockerLogin()
}