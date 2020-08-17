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

                stage('Send email') {
                    steps {
                        emailext attachLog: true, body: 'Test', postsendScript: 'Test', recipientProviders: [developers()], replyTo: '@wilp.bits-pilani.ac.in', subject: 'Jenkins ', to: '2013hz15516@wilp.bits-pilani.ac.in'
                    }
                }
                
            

                stage('Post-check') {
                    
                    steps {
                        echo "Deployment is Failed Due no Twx Installed"
                    }
                }
            
                    
                    
                
            
        }
  }  
