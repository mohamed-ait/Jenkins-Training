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
        stage('Example Username/Password') {
            environment {
                SERVICE_CREDS = credentials('test-creds')  // get the credentials
            }
            steps {
                sh 'echo "Service user is $SERVICE_CREDS_USR"'
                sh 'echo "Service password is $SERVICE_CREDS_PSW"'
            }
        }
    }
}