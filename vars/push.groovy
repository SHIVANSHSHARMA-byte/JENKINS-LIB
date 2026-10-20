def call(String Project,String ImageTag, String dockerhubuser){
withCredentials([usernamePassword(
   credentialsId: 'devshivansh_cred',
   passwordVariable:"devshivansh1104_pass",
   usernameVariable:"devshivansh1104_username")])
  {
   sh "docker login -u ${devshivansh1104_username} -p ${devshivansh1104_pass}"
   sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
  }
}
