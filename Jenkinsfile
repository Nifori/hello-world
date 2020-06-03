pipeline {
	agent any
	tools {
		maven 'M3'
		jdk '11'
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
				sh 'mvn -v'
				sh 'java -version'
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
