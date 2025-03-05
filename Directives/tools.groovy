pipeline{
    // agent section : where to run the pipeline
    agent any
    // tools section : contains all the tools required for the pipeline
    tools {
        // Install the Maven tool with the name 'M3'
        maven 'maven-tool'
        ant 'ant-tool'
    }
    stages {
        stage('maven tool') {
            steps {
                // Run the Maven tool with the name 'M3'
                sh 'mvn --version'
            }
        }
        stage('ant tool') {
            steps {
                // Run the Maven tool with the name 'M3'
                sh 'ant --version'
            }
        }
    }
}