pipeline{
    // agent section : where to run the pipeline
    agent any
    // input section : contains all the input parameters
    input {
        message 'Do you want to proceed?'
        ok 'Yes'
        parameters {
            string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
        }
    }
    stages {
        stage('Input Example Stage') {
            steps {
                echo "Hello, ${params.PERSON}"
            }
        }
    }
}