def call() {
  env.APPTYPE = "nodejs"
  node {
      common.codeCheckout()
      common.codeQuality()
      common.codeChecks()
      common.artifacts()
    }

}