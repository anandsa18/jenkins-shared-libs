def call() {
  script {
    withDockerRegistry(credentialsId: 'dockercred') {
      sh 'docker build -t anandsa18/ekart:latest --file docker/Dockerfile .'
    }
  }
}
