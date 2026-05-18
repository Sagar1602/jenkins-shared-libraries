def call(String GitUrl, String GitBranch){
  echo "in this step the code is fetched from the Github"
  git url: "${GitUrl}" , branch: "${GitBranch}"
  echo "Code clonned successfully :)"
}
