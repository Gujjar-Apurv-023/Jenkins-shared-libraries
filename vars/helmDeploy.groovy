def call(config) {

    sh """
    helm upgrade --install ${config.releaseName} ${config.chartPath} \
    --namespace ${config.namespace} \
    --create-namespace \
    -f ${config.valuesFile} \
    --set image.tag=${config.tag} \
    --wait \
    --timeout 1m
    """

}
