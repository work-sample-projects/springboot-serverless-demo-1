pipeline {
    agent any
    
    options {
        disableConcurrentBuilds()
    }

    stages {
        
        stage('Docker build'){
            steps {
                sh  """
                    docker build .
                """
            }
        }
//         stage('Test') {
//             steps {
                
//                 echo 'Testing..'
//                 sh 'mvn -B test'
//             }
//         }

        /*
        stage('Upload artifacts') {
            steps {
                echo 'Uploading artifacts....'
                // Insert your code to upload any produced artifacts in prep for deploy stage
            }
        }
        */
    }  

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
