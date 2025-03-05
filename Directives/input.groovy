pipeline {
    // agent section : where to run the pipeline
    agent any
    stages {
        stage('Input Example Stage') {
            steps {
                // input directive : to take input from the user
                script {
                    def userInput = input message: 'Do you want to proceed?',
                                         ok: 'Yes',
                                         parameters: [
                                             string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                                         ]
                    echo "Hello, ${userInput}"
                }
            }
        }
    }
}
