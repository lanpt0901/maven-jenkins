node {
  stage('SCM Checkout'){
    git 'https://github.com/lanpt0901/maven-jenkins'
  }
  stage('Compile-Package'){
    //Get maven home path
    def mvnHome = tool name: 'Maven 3.8.4', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  
  }
}
