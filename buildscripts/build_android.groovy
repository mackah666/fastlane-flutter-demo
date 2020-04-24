pipeline {
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