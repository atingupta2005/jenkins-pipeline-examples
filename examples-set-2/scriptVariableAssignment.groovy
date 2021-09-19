pipeline {
  agent {
    // executes on an executor with the label 'node1' or 'node2'
    label "node1 || node"
  }

  stages {
    stage("stage 1") {
      steps {
        script {
          env.name = "Atin"
        }
      }
    }
    stage("stage 2") {
      steps{
        echo "name: ${env.name}"
      }
    }
  }
}
