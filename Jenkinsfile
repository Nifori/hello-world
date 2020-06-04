pipeline {
	agent any
	tools {
		jdk 'javajdk'
		maven 'M3'
	}
	stages {
		stage('Checkout'){
			steps {
				git 'https://github.com/Nifori/hello-world'
			}
		}
		stage('Check') {
			steps {			
				echo 'Check..'
				sh 'echo $JAVA_HOME'
				sh 'java -version'
				sh 'mvn -v'
			}
		}
		stage('Test') {
			steps {			
				echo 'Testing..'
				sh 'mvn test'
			}
		}
		stage('SonarQube analysis') {
			script {
          		scannerHome = tool 'Scanner'
        	}
    		withSonarQubeEnv('PersonalSonarQube') {
      			sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar'
   	 		}
  		}
		stage('Build') {
			steps {
				echo 'Building..'
				sh 'mvn package'
			}
		}
	}
}
