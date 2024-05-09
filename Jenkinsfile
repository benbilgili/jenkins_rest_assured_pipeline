pipeline {
    agent any

    stages {
        stage('Checkout and Run API Server') {
            steps {
                script {
                    echo "Current directory: ${pwd()}"
                    sh 'ls -l'
                    sh 'json-server --watch data.json --port 3002 &'
                    sleep time: 10, unit: 'SECONDS' // Adjust sleep time as needed
                }
            }
        }

        stage('Run RestAssured Tests') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
    }
}
