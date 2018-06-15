pipeline{
    agent any    
    stages{
        stage("checkout"){
            steps{
                git url:'https://github.com/mahesh-shrestainfotech/springboot.git'
            }
        }
        
        stage("Compile"){
            steps{
                sh "sh ./mvnw compile"
            }
        }
        
        stage("Unit test"){
            steps{
                sh "sh ./mvnw test"
            }
        }
        
        stage("Package"){
        	steps{
        		sh "sh ./mvnw package"
        	}
        }        
        
        
        
        stage("Docker build"){
        	steps{
        	    sh "sh docker login --username egiantsdocker --password Egaints#1"        	
        		sh "sh docker build -t egiantsdocker/springboot ."
        		sh "sh docker push egiantsdocker/springboot"
        	}
        }
        
        
        
    }
}
