pipeline {
    agent any

    stages {
        stage('Initialize Workspace') {
            steps {
                // Clean up workspace
                deleteDir()
                
                // Checkout Git repository
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[url: 'https://github.com/benbilgili/jenkins_rest_assured_pipeline']]])
            }
        }

        stage('Checkout and Run API Server') {
            steps {
                script {
                    echo "Current directory: ${pwd()}"
                    bat 'dir'
                    bat 'start json-server --watch data.json --port 3002'
                    sleep time: 2, unit: 'SECONDS'
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