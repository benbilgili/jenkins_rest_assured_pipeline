pipeline {
    agent any

    stages {
        stage('Checkout and Install Dependencies') {
            steps {
                script {
                    echo "Current directory: ${pwd()}"
                    bat 'dir'
                    bat 'cd jenkins_rest_assured_pipeline'
                }
            }
        }

        stage('Run RestAssured Tests') {
            steps {
                script {
                    bat 'mvn test'
                }
            }
        }
    }
}
