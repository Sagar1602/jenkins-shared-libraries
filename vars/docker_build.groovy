def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "in this step the code is build "
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  
}
