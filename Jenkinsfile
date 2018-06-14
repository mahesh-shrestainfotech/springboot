pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
                git url:'https://github.com/mahesh-shrestainfotech/calculator.git'
            }
        }
        
        stage("Compile"){
            steps{
                sh "./mvnw compile"
            }
        }
        
        stage("Unit test"){
            steps{
                sh "./mvnw test"
            }
        }
        
        stage("Package"){
        	steps{
        		sh "./mvnw build"
        	}
        }        
        
        
        
        stage("Docker build"){
        	steps{
        	    sh "docker login --username egiantsdocker --password Egaints#1"        	
        		sh "docker build -t egiantsdocker/springboot ."
        		sh "docker push egiantsdocker/springboot"
        	}
        }
        
        
        
    }
}
