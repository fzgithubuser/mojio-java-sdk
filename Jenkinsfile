// Declarative //
pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh 'gradlew clean build'
				archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
			}
		}
		stage('Test') {
			steps {
				sh 'gradlew test'
			}
		}
	}
}
