node {
  stage('SCM Checkout'){
    git 'https://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@github.com/lanpt0901/maven-jenkins.git'
  }
  stage('Compile-Package'){
    //Get maven home path
    def mvnHome = tool name: 'Maven 3.8.4', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  
  }
}
