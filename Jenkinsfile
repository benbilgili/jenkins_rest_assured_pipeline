pipeline {
    agent any

    stages {
        stage('Checkout and Run API Server') {
            steps {
                script {
                    echo "Current directory: ${pwd()}"
                    bat 'dir'
                    // bat 'start json-server --watch data.json --port 3002'
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
