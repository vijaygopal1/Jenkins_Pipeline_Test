pipeline {
    agent any
  
    

    stages {

        stage('Pre-check') {
            steps {
                echo "Prep for Deployment"
            }
        }

            stage('Display date & Current time') {
                steps {
                    script{
                        sh label: '', script: 'date +"%m-%d-%Y"'
                    }
               
                }
                }

                stage('Wait for User I/p') {
                    steps {
                        input message: 'Proceed further ?', ok: 'Yes'
                    }
                }
                
            

                stage('Post-check') {
                    
                    steps {
                        echo "Deployment is Failed Due no Twx Installed"
                    }
                }
            
                    
                    
                
            
        }
  }  
