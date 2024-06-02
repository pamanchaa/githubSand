pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control
                git 'https://github.com/your-repository.git'
            }
        }
        
        stage('Run Hello.java') {
            steps {
                // Call your batch file
                bat 'path\\to\\your-script.bat'
            }
        }
    }
}
