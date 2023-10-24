pipeline {
    agent any

    stages {
        stage('First Stage'){
            steps{
                echo "First Stage"
            }
        }
        stage('parallel1'){
            parallel {
                stage('parallel1 1st'){
                    steps{
                        echo 'p11'
                    }
                }

                stage('parallel1 2st'){
                    steps{
                        echo 'p12'
                    }
                }

                stage('parallel1 3rd'){
                    steps{
                        echo 'p13'
                    }
                }
            }
        }
        stage('parallel2') {
            parallel {
                stage('parallel2 1st'){
                    steps{
                        echo 'p21'
                    }
                }

                stage('parallel2 2st'){
                    steps{
                        echo 'p22'
                    }
                }

                stage('parallel2 3rd'){
                    steps{
                        echo 'p23'
                    }
                }
            }
        }
        
        stage('Third Stage'){
            steps{
                echo 'Third Stage'
            }
        }
    }
}
