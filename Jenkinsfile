pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building application with Maven...'
                sh '''
                    docker run --rm \
                      -v jenkins_home:/app \
                      -w /app/workspace/aws-devops-pipeline \
                      maven:3.9-eclipse-temurin-21 \
                      mvn clean package -DskipTests
                '''
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Building Docker image...'
                sh 'docker build -t aws-devops-project .'
            }
        }

        stage('Docker Push') {
            steps {
                echo 'Pushing Docker image...'
                sh 'docker tag aws-devops-project:latest ashokcsdev/aws-devops-project:latest'
                sh 'docker push ashokcsdev/aws-devops-project:latest'
            }
        }

    }
}
