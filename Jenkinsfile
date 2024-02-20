pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    // Ejecutar la tarea de construcción y pruebas de Gradle
                    bat 'gradlew clean test'
                }
            }
        }
    }

    post {
        always {
            // Configurar la recopilación de informes de pruebas según tu estructura de informes
            junit '**/build/test-results/test/*.xml'
        }
    }
}
