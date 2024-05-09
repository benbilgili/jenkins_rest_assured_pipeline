pipeline {
    agent any

    stages {
        stage('Checkout and Run API Server') {
            steps {
                script {
                    echo "Current directory: ${pwd()}"
                    sh 'ls -l'
                    sh 'which json-server'
                    sh 'which mvn'
                    sh 'json-server --watch data.json --port 3002 &'
                    sleep time: 20, unit: 'SECONDS'
                }
            }
        }

        stage('Run RestAssured Tests') {
            steps {
                script {
                    try {
                        sh 'mvn test'
                    } catch (Exception e) {
                        echo "Failed to run RestAssured tests: ${e.message}"
                        currentBuild.result = 'FAILURE'
                        error 'Failed to run RestAssured tests'
                    }
                }
            }
        }
    }
}
