def call() {
    sh '''
    if command -v helm >/dev/null 2>&1; then
        echo "Helm already installed"
    else
        curl https://raw.githubusercontent.com/helm/helm/main/scripts/get-helm-3 | bash
    fi
    '''
}
