def call() {
    node {

//        if (! env.TAG_NAME) {
//         env.TAG_NAME = ""
//        }

        sh 'env'
        common.codeQuality()

        if ( branch == main || tag ==~ "*") {
            stage('Style Checks') {
                echo 'Style Checks'
            }
        }


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
//   }