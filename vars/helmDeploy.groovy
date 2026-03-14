def call(config) {

    sh """
    helm upgrade --install ${config.releaseName} ${config.chartPath} \
    --namespace ${config.namespace} \
    --create-namespace \
    -f ${config.valuesFile} \
    --wait \
    --timeout 5m
    """

}
