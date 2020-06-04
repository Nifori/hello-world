pipeline {
	agent any
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
				sh 'M3 -v'
			}
		}
		stage('Test') {
			steps {			
				echo 'Testing..'
				sh 'M3 test'
			}
		}
		stage('Build') {
			steps {
				echo 'Building..'
				sh 'M3 package'
			}
		}
	}
}
