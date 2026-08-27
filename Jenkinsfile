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

        stage('Docker Push') {
            steps {
                echo 'Pushing Docker image...'
                sh 'docker tag aws-devops-project:latest ashoksdev/aws-devops-project:latest'
                sh 'docker push ashoksdev/aws-devops-project:latest'
            }
        }
    }
}
