def call(imageName) {
    sh '''
    if [ "$(docker ps -q -f name=notes-app)" ]; then
        echo "Container already running"
    else
        docker run -d -p 5000:5000 --name notes-app '"${imageName}:latest"'
    fi
    '''
}
