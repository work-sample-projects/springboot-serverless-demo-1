pipeline {
    agent any
    
    options {
        disableConcurrentBuilds()
    }

    stages {
        
        stage('Docker build'){
            steps {
                sh  """
                    docker run- -rm --name rhlisteners -v '\$(pwd)':/springboot-serverless-demo-1 --workdir /springboot-serverless-demo-1 maven:3.3-jdk-8 mvn clean install
                """
            }
        }
        stage('Test') {
            steps {              
                sh  """
                    docker run --rm --name rhlisteners -v '\$(pwd)':/springboot-serverless-demo-1 --workdir /springboot-serverless-demo-1 maven:3.3-jdk-8 mvn test
                """
            }
        }

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
