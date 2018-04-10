// Declarative //
pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh './gradlew clean build'
				archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
			}
		}
		stage('Test') {
			steps {
				sh './gradlew test'
			}
		}
	}
}
