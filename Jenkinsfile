pipeline {
    agent any

    tools {
        nodejs 'Node'
        
    }

    stages {
        stage('Checkout and Run API Server') {
            steps {
                script {
                    echo "Current directory: ${pwd()}"
                    sh 'ls -l'
                    sh 'npm install json-server'
                    sh 'npx json-server --watch data.json --port 3002 h&'
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
