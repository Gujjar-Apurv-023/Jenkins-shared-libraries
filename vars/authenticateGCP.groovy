def call() {
    withCredentials([file(credentialsId: 'gcp-artifact-key', variable: 'GOOGLE_APPLICATION_CREDENTIALS')]) {
        sh '''
        gcloud auth activate-service-account --key-file=$GOOGLE_APPLICATION_CREDENTIALS
        gcloud auth configure-docker us-central1-docker.pkg.dev --quiet
        '''
    }
}
