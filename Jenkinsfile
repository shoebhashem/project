pipeline {
    agent any
   
    tools {
        maven 'MAVEN'
        jdk 'JDK8'
    }

    stages {
        stage('git') {
            steps {
                // Get some code from a GitHub repository
                echo 'checkout from github'
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '41ef06c7-c73f-46ac-b7e1-d7735be9f5f6', url: 'https://github.com/shoebhashem/LeanTesting.git']])
            }
        }
        stage('clean') {
            steps {
                // Get some code from a GitHub repository
                echo 'mvn clean'
                sh "mvn clean"
            }
        }
        stage('compile') {
            steps {
                // Get some code from a GitHub repository
                echo 'mvn compile'
                sh "mvn compile"
            }
        }
        stage('generate test cases') {
            steps {
                // Get some code from a GitHub repository
                echo 'generate test cases'
                sh "mvn evosuite:generate"
            }
        }
        stage('export test cases') {
            steps {
                // Get some code from a GitHub repository
                echo 'export test cases'
                sh "mvn evosuite:export"
            }
        }

        stage('test') {
            steps {
                // Get some code from a GitHub repository
                echo 'execute tests'
                sh "mvn clean test jacoco:restore-instrumented-classes jacoco:report"
                }
        }

    }
    post {
        success {
            jacoco(
                execPattern: '**/build/jacoco/*.exec',
                classPattern: '**/build/classes/java/main',
                sourcePattern: '**/src/main'
            )
        }
    }
}