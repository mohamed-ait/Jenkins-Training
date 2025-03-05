pipeline {
    // agent section : where to run the pipeline
    agent any
    // environment section : contains all the environment variables
    environment {
        BUILD_VERSION = '1.0.0'
        TARGET_ENV = 'production'
    }
    // stages section : contains all the stages of the pipeline
    stages {
        stage('Example Stage') {
            steps {
                // display the environment variables values : BUILD_VERSION and TARGET_ENV
                echo "Building version ${env.BUILD_VERSION} for ${env.TARGET_ENV}"
                // Your build steps here
            }
        }
    }
}