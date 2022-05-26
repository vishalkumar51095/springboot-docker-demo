# springboot-docker-demo
docker simple demo project with spring boot

1.create executable jar
2.create Docker file
3.Build Docker Image
4.Run Docker Container
(i) firstly we clean the pom.xml file then install or create package from pom.xml file jar file will create by this process
(ii) we check jar file will run or not? this will be done by this command
    java -jar "jar file name"
(iii) create a Dockerfile with name "Dockerfile"-->(i) FROM openjdk:
                                                   (ii) VOLUME /tmp
                                                   (iii) ADD  target/jarFileName  jarFileName
                                                   (iv) ENTRYPOINT ["java","-jar","jarFileName"]
                                                    (v) LABEL maintainer=" "
(iv) check docker version by this command-->
    docker --version
(v) build a image into docker by this command
    docker build -t "docker image name" . (Note:1. " " this is not allowed  2. "." show the current path of jar file)
(vi) check image create or not by this command-->
     docker images (or docker image ls)
(vii) Now,Create conatiner of docker image and run container by this command-->
      docker run -p8080:8080 "docker image name"
      After this command project will run.
(viii) we see project in running phase by this command-->
        docker ps  
 (viii) After testing of project we will stop/remove running container by this command-->
        docker stop "Container-Id"
 (ix) Now we will check docker image is not running by this command-->
        docker ps
      

    
