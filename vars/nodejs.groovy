def call() {
    node {


          common.codeQuality()

//            stage('Style Checks') {
//                when {
//                    branch 'main'
//                }
//                steps {
//                    echo 'Style Checks'
//                }
//            }
//
//            stage('Unit Tests') {
//                when {
//                    anyOf {
//                        branch 'main'
//                        tag "*"
//                    }
//                }
//                steps {
//                    echo 'Unit Tests'
//                }
//            }
//
//            stage('Download Dependencies') {
//                when { tag "*" }
//                steps {
//                    echo 'Download Dependencies'
//                }
//            }
//
//            stage('Prepare Artifact') {
//                when { tag "*" }
//                steps {
//                    echo 'Prepare Artifact'
//                }
//            }
//
//            stage('Publish Artifact') {
//                when { tag "*" }
//                steps {
//                    echo 'Publish Artifact'
//                }
//            }
//
//    }
//
//}