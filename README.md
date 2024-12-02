# spring-boot-docker-compose-sample
![super-necessary](https://github.com/yoonmyatphoo-mmr/spring-boot-docker-compose-sample/blob/main/6226574214438174853.jpg)

* This is the sample project for spring-boot using docker compose and build dockerized application.
* Docker Compose is to manage one or many containerized applications in one configuration file called `docker-compose.yml` and you can easily build and run your applications by using that file.

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [About The Project](#about-the-project)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Clone Project](#clone-project)
    - [Prerequisites](#prerequisites)
    - [Instruction](#instruction)
- [Contact Me](#contact)
- [Contributing](#Contributing)


<a name="about-the-project"></a>
## ⚡️About The Project
This demo shows how to use Docker Compose with Spring Boot.
Docker Compose manages multiple containers with a single docker-compose.yml file. Use:
`docker-compose up -d` to start
`docker-compose down -d` to stop
Learn Docker basics first: [Spring Boot Docker Sample](https://github.com/yoonmyatphoo-mmr/spring-boot-docker) <br>
Running apps in containers simplifies deployment. See the [Instruction](#instruction) section for commands.

<a name="built-with"></a>
### 🪓 Built With
This project is built with
* [Java](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* [Docker](https://www.docker.com/products/docker-desktop/)


<a name="getting-started"></a>
## 🔥 Getting Started
This project demonstrates running a java application as `docker container` by using `Docker Compose` and so, if you want to run your application as container, <br>
* Install`Docker` on your machine. [Get Docker](https://www.docker.com/products/docker-desktop/) <br>


<a name="clone-project"></a>
### 🥡 Clone Project
* Clone the repo
   ```sh
   git clone https://github.com/yoonmyatphoo-mmr/spring-boot-docker-compose-sample.git
   ```
<a name="prerequisites"></a>
### 🔑 Prerequisites
You need to install `Docker` on your machine. [Get Docker](https://www.docker.com/products/docker-desktop/). <br>
You need to learn sample dockerized application by using `Dockerfile` first. [Spring Boot Docker Sample](https://github.com/yoonmyatphoo-mmr/spring-boot-docker-sample)


<a name="instruction"></a>
### 📝 Instruction
This guide simplifies running a Java application as a `docker container` using `Docker Compose`
## Steps
* 1.Generate jar file
Run one of the following commands in your project folder:
  `mvn clean package` <br>
  `mvn clean package -DskipTests=true` # for skipping test for unnecessary compile time error.<br>
  `mvn clean install` <br>
  `mvn clean install -DskipTests=true`
* 2.Check docker 
Verigy Docker is installed and running:
`docker --version`
* 3.Build image and run application as container
    * Ensure your generated JAR file is in the target folder and matches the same specified in the `Dockerfile`
    * Run the following command to build and run the container:
  * ```sh
    docker-compose up -d
    ```
  * `up` : Builds the images and runs the container.
  * `-d` : Runs in detached mode(background). Remove `-d` to view logs in the terminal.
* 4. Check Docker images and Containers
  * View created images:
  * ```sh
    docker images
    ```
  * Check running containers:
      ```sh
      docker ps
       ```
  * Check all containers (including stopped):
    ```sh
    docker ps -a
    
* 5. Test the Application
After the application is running, test it by visiting:
  `http://localhost:8080/spring-boot-docker-compose-sample/getHello` 

* 6. View Logs
  * Withour `-d`: Logs will appear in the terminal. You can stop the application with `Ctrl+C`
  * With `-d`: View logs for a container:
    
    ```sh
    docker logs -f -n 200 {container_id}
    ```

* 7. Stop the Container
  * if you use, `docker-compose down`, it will remove(delete) container)
  * So, no need to manual remove (delete) container to removing image if you use `docker-compose down`.
    ```sh
    docker rmi {image_id}
    ```
  * To stop and remove the container:
    ```sh
    docker-compose down
    ```
  * if you're not using `docker-compose.yml`, you can manually stop the container:
    ```sh
    docker stop {container_id}
    ```

<a name="contact"></a>
## ✉️ Contact Me
Name - Yoon Myat Phoo <br> 
LinkedIn profile -  [Yoon Myat Phoo's LinkedIn](https://www.linkedin.com/in/yoon-myat-phoo-9b32531b7/)  <br> 
Email Address - <a href="mailto:yoonmyatphoo.mmr@gmail.com?">yoonmyatphoo.mmr@gmail.com</a> <br> 
WhatsApp - [+959252656065](https://wa.me/959252656065?text=Hi) <br> 

Project Link: [Spring Boot Docker Compose Sample](https://github.com/yoonmyatphoo-mmr/spring-boot-docker-compose-sample)



<a name="contributing"></a>
## ⭐ Contributing
Contributions are what make the open source community such an amazing place to be learnt, inspire, and create. Any contributions you make are **greatly appreciated**.
<br>If you want to contribute....
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/yourname`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeatures'`)
4. Push to the Branch (`git push -u origin feature/yourname`)
5. Open a Pull Request
