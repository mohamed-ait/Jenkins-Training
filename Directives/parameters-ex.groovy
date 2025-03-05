pipeline {
    // agent section : where to run the pipeline
    agent any
    // parameters section : contains all the parameters of the pipeline
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')

        text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')

        booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

        choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')

        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
    }
    // stages section : contains all the stages of the pipeline
    stages {
        stage('Init Stage') {
            steps {
                echo "Starting the pipeline..."
            }
        }
        // Display Parameters stage : display the parameters in the console
        stage('Display Parameters') {
            steps {
                echo "Hello ${params.PERSON}"

                echo "Biography: ${params.BIOGRAPHY}"

                echo "Toggle: ${params.TOGGLE}"

                echo "Choice: ${params.CHOICE}"

                wrap([$class: 'MaskPasswordsBuildWrapper']) {
                    sh "echo 'Using password: ${params.PASSWORD}'"  //  The password is masked in logs
                }
            }
        }
    }
}