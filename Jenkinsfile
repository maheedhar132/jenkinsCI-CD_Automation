
def BASIC_AUTH = "sys_root:1105ac9004959feeec5c41209d50891737"
def JENKINS_ADDRESS = "http://15.206.91.122:8080/"
pipeline{
    agent any
    stages{
        stage('convert job config to xml'){
            steps{
                script{
                    sh "java -jar artifacts/job-dsl-core-1.76-standalone.jar config/CD.groovy"
                }
            }
        }
        stage('create jenkins job using the generated xml'){
            steps{
                script{
                    sh 'curl -X POST http://sys_root:1105ac9004959feeec5c41209d50891737@15.206.91.122:8080/createItem?name=my_pipeline \
                        --header "Content-Type:text/xml" \
                        --data-binary @jobname.xml'
                }
            }
        }
        
    }
}