pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // In exam, just say: "Jenkins pulls code from Git"
                git 'https://github.com/DussaUday/student-attendance.git'
            }
        }

        stage('Build') {
            steps {
                // Windows:
                bat 'mvn clean package'
                // (On Linux it would be: sh 'mvn clean package')
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }

        // Simple example deployment step for Tomcat
        stage('Deploy to Tomcat') {
            steps {
                echo 'Deploying WAR to Tomcat (example step)'

                // In real time you may:
                // 1. Copy WAR to Tomcat webapps folder, or
                // 2. Use curl to hit Tomcat Manager API.
                //
                // Example (Linux-style, for understanding):
                // sh 'cp target/student-attendance-system.war /opt/tomcat/webapps/'
            }
        }
    }
}
