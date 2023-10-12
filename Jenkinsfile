pipeline{
    agent any
    tools{
        maven '3.6.3'
    }
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
            post{
                success{
                    echo 'Archiving the artifacts'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage('Deploy to tomcast server'){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'Tomcat', path: '', url: 'http://localhost:8000/')], contextPath: null, war: '**/*.war'
            }
        }
    }
}