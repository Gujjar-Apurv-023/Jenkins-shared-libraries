def call(sonarHome) {
    withSonarQubeEnv('sonar') {
        sh """
        ${sonarHome}/bin/sonar-scanner \
        -Dsonar.projectName=simple-notes-app \
        -Dsonar.projectKey=simple-notes-app
        """
    }
}
