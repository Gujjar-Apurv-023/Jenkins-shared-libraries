def call(imageName) {
    sh """
    docker build --pull -t ${imageName}:latest .
    """
}
