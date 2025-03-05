pipeline{
    // agent section : where to run the pipeline
    agent any
    // triggers section : contains all the triggers of the pipeline
    triggers {
        // Trigger the pipeline every 5 minutes
        cron('H/5 * * * *')
    }
    stages {
        stage('Example Stage') {
            steps {
                echo 'This is the Example Stage of the pipeline, which triggers every 5 minutes as per the cron schedule'
            }
        }
    }
}