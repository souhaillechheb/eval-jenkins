pipeline{
    agent any
    tools {
      maven 'maven'
    }
    environment {
      DOCKER_TAG = getVersion()
    }
    stages{
        stage('SCM'){
            steps{
                git credentialsId: 'github', 
                    url: 'https://github.com/souhaillechheb/eval-jenkins.git',
                    branch: 'main'
            }
        }
        
        stage('Maven Build'){
            steps{
                sh "mvn clean package"
            }
        }
        
        stage('Docker Build'){
            steps{
                sh "docker build . -t souhailapp:${DOCKER_TAG}   "
            }
        }
        
    }
}

def getVersion(){
    def commitHash = sh label: '', returnStdout: true, script: 'git rev-parse --short HEAD'
    return commitHash
}
