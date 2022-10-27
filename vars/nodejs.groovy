def call() {
    node {

        sh 'env'
        common.codeQuality()

        if ( branch == main || tag ==~ "*" ) {
            stage('Style Checks') {
                echo 'Style Checks'
            }
        }
    }

}