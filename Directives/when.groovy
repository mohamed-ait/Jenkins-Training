pipeline {
    agent any
    environment {
        DEPLOY_TO = 'test'
    }
    stages {
        stage('Example Build') {
            steps {
                echo 'Building the app !'
            }
        }
        stage('Example Deploy') {
            when {
               environment name: 'DEPLOY_TO', value: 'production'
            }
            steps {
                echo 'Deploying the app to production !'
            }
        }
    }
}