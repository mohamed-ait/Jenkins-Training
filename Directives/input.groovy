pipeline{
    // agent section : where to run the pipeline
    agent any
    // input section : contains all the input parameters
    stages {
        stage('Input Example Stage') {
            input {
                    message 'Do you want to proceed?'
                    ok 'Yes'
                    parameters {
                        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                    }
                }
            steps {
                echo "Hello, ${params.PERSON}"
            }
        }
    }
}