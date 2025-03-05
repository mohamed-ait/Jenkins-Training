pipeline{
    // agent section : where to run the pipeline
    agent any
    // tools section : contains all the tools required for the pipeline
    tools {
        // Install the Maven tool with the name 'M3'
        maven 'maven-tool'
    }
    stages {
        stage('Example Stage') {
            steps {
                // Run the Maven tool with the name 'M3'
                sh 'mvn --version'
            }
        }
    }
}