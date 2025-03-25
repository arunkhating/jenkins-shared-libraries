def call(String ImageName, String Tag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId:"dockerHubcred", usernameVariable:"dockerHubUser", passwordVariable:"dockerHubPass")]){
      sh "docker login -u ${dockerHubUser} -p ${env.dockerHubPass}"
  }
      sh "docker push ${dockerHubUser}/${ImageName}:${Tag}"
  }






