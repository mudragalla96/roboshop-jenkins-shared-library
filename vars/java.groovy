def call() {
    env.SONAR_EXTRA_OPTS = "-Dsonar.java.binaries=./target"
    env.APPTYPE = "java"
    node {
        common.codeCheckout()
        stage('Compile Code') {
            sh 'mvn compile'
        }
        common.codeQuality()
        common.codeChecks()
        common.artifacts()
    }

}