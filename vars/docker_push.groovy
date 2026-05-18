def call(String Dockerhub_user,String Project, String ImageTag){
  echo "in this step we are pushig the image to dockerhub"
  withCredentials([usernamePassword(
    credentialsId:"Dockerhub_cred",
    passwordVariable:"Dockerhub_pass",
    usernameVariable:"Dockerhub_user"
                )])
  {
                sh "docker login -u ${Dockerhub_user} -p ${Dockerhub_pass}"
              //  sh "docker image tag node-app:latest ${env.Dockerhub_user}/node-app:latest"
                sh "docker push ${Dockerhub_user}/${Project}:${ImageTag}"
                }
  
}
