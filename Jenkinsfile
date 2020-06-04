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
				sh 'cd ./var/jenkins_home/tools/hudson.model.JDK/javajdk'
				sh 'ls -a'
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
		stage('Build') {
			steps {
				echo 'Building..'
				sh 'mvn package'
			}
		}
	}
}
