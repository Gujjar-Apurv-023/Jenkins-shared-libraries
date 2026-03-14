def call(config) {

    sh """
    helm upgrade --install ${config.releaseName} ${config.chartPath} \
    --namespace ${config.namespace} \
    -f ${config.valuesFile}
    """

}
