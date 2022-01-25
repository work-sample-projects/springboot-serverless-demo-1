pipeline {
    agent any
    
    options {
        disableConcurrentBuilds()
    }

    stages {
        stage('Build') {
           steps {
               echo 'Building..'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                
                echo 'Testing..'
                sh 'mvn -B test'
            }
        }

        /*
        stage('Upload artifacts') {
            steps {
                echo 'Uploading artifacts....'
                // Insert your code to upload any produced artifacts in prep for deploy stage
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
                // Insert your deploy code here
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
