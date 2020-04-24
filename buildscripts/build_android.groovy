pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                dir("android"){
                    sh 'fastlane android build'
                }
                
            }
        }
    }
}