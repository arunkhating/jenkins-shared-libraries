def call(String image, String Tag, String dockerHubUser,){
  withCredentials([usernamePassword("credentialsId":"dockerHubcred", usernameVariable:"dockerHubUser", passwordVariable:"dockerHubPass")]){
      sh "docker login -u ${dockerHubUser} -p ${env.dockerHubPass}"
  }
      sh "docker tag ${image}:${Tag} ${dockerHubUser}/${image}:${Tag}"
      sh "docker push ${dockerHubUser}/${image}:${Tag}"
  }






