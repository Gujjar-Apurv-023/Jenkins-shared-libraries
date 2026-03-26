def call(config) {

    sh """
    echo "Deploying release: ${config.releaseName}"
    echo "Namespace: ${config.namespace}"
    echo "Image tag: ${config.tag}"

    helm upgrade --install ${config.releaseName} ${config.chartPath} \
    --namespace ${config.namespace} \
    --create-namespace \
    -f ${config.valuesFile} \
    --set image.tag=${config.tag} \
    --wait \
    --timeout 3m
    """
}
