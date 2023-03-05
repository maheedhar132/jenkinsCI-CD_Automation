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
            url('job_url')
             credentials('credentialID')
          }
          branch('*/master')
        }
        scriptPath('devops/ci/Jenkinsfile')
        }
    }
  }
}