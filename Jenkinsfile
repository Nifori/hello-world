pipeline {
	agent any
	tools {
		jdk 'javajdk'
		maven 'mvn3'
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
				sh 'mvn3 -v'
			}
		}
		stage('Test') {
			steps {			
				echo 'Testing..'
				sh 'mvn3 test'
			}
		}
		stage('Build') {
			steps {
				echo 'Building..'
				sh 'mvn3 package'
			}
		}
	}
}
