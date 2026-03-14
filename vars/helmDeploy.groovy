def call(config) {

    sh "kubectl get namespace ${config.namespace}"

    sh """
    helm upgrade --install ${config.releaseName} ${config.chartPath} \
    --namespace ${config.namespace} \
    -f ${config.valuesFile}
    """

}
