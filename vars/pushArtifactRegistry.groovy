def call(imageName) {
    sh """
    docker push ${imageName}:latest
    """
}
