pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building application with Maven...'
                sh '''
                    docker run --rm \
                      -v jenkins_home:/app \
                      -w /app/workspace/${JOB_NAME} \
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

        stage('Docker Push - Docker Hub') {
            steps {
                echo 'Pushing Docker image to Docker Hub...'
                sh 'docker tag aws-devops-project:latest ashokcsdev/aws-devops-project:latest'
                sh 'docker push ashokcsdev/aws-devops-project:latest'
            }
        }

        stage('ECR Login') {
            steps {
                echo 'Logging in to Amazon ECR...'
                sh '''
                    aws ecr get-login-password --region ap-south-1 | \
                    docker login --username AWS --password-stdin \
                    839084984521.dkr.ecr.ap-south-1.amazonaws.com
                '''
            }
        }

        stage('Docker Push - ECR') {
            steps {
                echo 'Pushing Docker image to Amazon ECR...'
                sh '''
                    docker tag aws-devops-project:latest \
                    839084984521.dkr.ecr.ap-south-1.amazonaws.com/aws-devops-project:latest

                    docker push \
                    839084984521.dkr.ecr.ap-south-1.amazonaws.com/aws-devops-project:latest
                '''
            }
        }
    }
}
// GitHub webhook CI test
