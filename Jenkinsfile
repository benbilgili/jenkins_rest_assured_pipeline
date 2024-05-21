pipeline {
    agent any

    tools {
        nodejs 'Node'
        maven 'Mvn'
    }

    environment {
        JSON_SERVER_PORT = '3002'
    }

    stages {
        stage('Checkout and Run API Server') {
            steps {
                script {
                    echo "Current directory: ${pwd()}"
                    sh 'ls -l'
                    sh 'npm install json-server'
                    sh "npx json-server --watch data.json --port ${JSON_SERVER_PORT} &"
                    sleep time: 10, unit: 'SECONDS' 
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

        stage('Echo nothing') {
            steps {
                script {
                    echo 'nothing'
                }
            }
        }
    }

    post {
        always {
            echo 'Cleaning up background processes'
            sh "pkill -f 'json-server --watch'"
        }
        success {
            echo 'Tests passed successfully.'
        }
        failure {
            echo 'Tests failed.'
        }
    }
}
