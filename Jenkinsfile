pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building application with Maven...'
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Building Docker image...'
                sh 'docker build -t aws-devops-project .'
            }
        }
    }
}
