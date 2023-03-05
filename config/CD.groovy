pipelineJob('jobname') {
    parameters {
        stringParam('VAULT_URL', 'https://vault.com:port/')
        stringParam('VAULT_USER', 'admin')
    }
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://joburl')
             credentials('credentialID')
          }
          branch('*/master')
        }
        scriptPath('devops/cd/Jenkinsfile')
        }
    }
  }
}