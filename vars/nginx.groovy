def call() {
    env.APPTYPE = "nginx"
    node {
        common.codeCheckout()
        common.codeQuality()
        common.codeChecks()
        common.artifacts()
    }

}