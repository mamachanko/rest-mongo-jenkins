pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withDockerContainer('maven:3.6.1-jdk-11') {
                    echo 'Building inside maven:3.6.1-jdk-11 ...'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
