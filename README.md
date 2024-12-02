# spring-boot-docker-compose-sample
<!-- PROJECT SHIELDS -->

<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/yewin-mm/spring-boot-docker-compose-sample.svg?style=for-the-badge
[contributors-url]: https://github.com/yewin-mm/spring-boot-docker-compose-sample/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/yewin-mm/spring-boot-docker-compose-sample.svg?style=for-the-badge
[forks-url]: https://github.com/yewin-mm/spring-boot-docker-compose-sample/network/members
[stars-shield]: https://img.shields.io/github/stars/yewin-mm/spring-boot-docker-compose-sample.svg?style=for-the-badge
[stars-url]: https://github.com/yewin-mm/spring-boot-docker-compose-sample/stargazers
[issues-shield]: https://img.shields.io/github/issues/yewin-mm/spring-boot-docker-compose-sample.svg?style=for-the-badge
[issues-url]: https://github.com/yewin-mm/spring-boot-docker-compose-sample/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ye-win-1a33a292/

<h1 align="center">
  Overview
  <img src="https://github.com/yewin-mm/spring-boot-docker-compose-sample/blob/master/github/template/images/overview/spring_boot_docker_compose.png" /><br/>
</h1>


# spring-boot-docker-compose-sample
* This is the sample project for spring-boot using docker compose and build dockerized application.
* Docker Compose is to manage one or many containerized applications in one configuration file called `docker-compose.yml` and you can easily build and run your applications by using that file.

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [About The Project](#about-the-project)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Before you begin](#before-you-begin)
    - [Clone Project](#clone-project)
    - [Prerequisites](#prerequisites)
    - [Instruction](#instruction)
- [Contact Me](#contact)
- [Becoming a Sponsor](#becoming-a-sponsor)
- [Contributing](#Contributing)


<a name="about-the-project"></a>
## ⚡️About The Project
This is Demo Project for Spring boot with docker compose. <br>
Docker Compose is to manage one or many containerized applications in one configuration file called `docker-compose.yml` and you can easily build and run your applications by using that file. <br>
Also, `docker-compose` is to reduce typing many commands to run multiple containers in CMD or Terminal and all you need is to type `docker-compose up -d` and `docker-compose down -d`. <br>
You should learn application with Dockerfile without docker-compose first in here. [Spring Boot Docker Sample](https://github.com/yewin-mm/spring-boot-docker-sample) <br>
As of now, running application as container way is the best option to manage application deployment. (you can find more about benefits of using docker in google). <br>
You can learn how to add configuration in Docker Compose file to build dockerized application. <br>
I've dropped some docker commands to run application in below [Instruction](#instruction) section. <br>
For more about docker and docker commands, you can learn more about in google.


<a name="built-with"></a>
### 🪓 Built With
This project is built with
* [Java](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* [Docker](https://www.docker.com/products/docker-desktop/)


<a name="getting-started"></a>
## 🔥 Getting Started
This project purpose is to run java application as `docker container` by using `Docker Compose` and so, if you want to run your application as container, <br>
you need to install `Docker` in your machine. [Get Docker](https://www.docker.com/products/docker-desktop/) <br>
If you are using window, you need to enable Hyper-V in your laptop. <br>
If you got installation error, you can find more about install Docker in here, [Install docker on Window](https://docs.docker.com/desktop/install/windows-install/) <br>

So, please make sure all are installed in your machine.<br>
- After installation was success, please note that docker will open when you turn on your computer as default, and it will take space on RAM of your machine. <br> 
So, you need to set the setting that **not to open always** when you turn on your computer (login account) to reduce unnecessary taking space when you are not using related with docker.
- Open `docker desktop` and you can see `docker icon` which are at noti bar. (Window user need to expand arrow which bottom right corner to see docker icon whereas Mac user can see at top noti bar).
- `Right click` on docker icon and click `Dashboard`, after docker desktop was open, click `setting icon` (top right corner) and `uncheck` (untip) mark on `“Start Docker Desktop when you login”` in `General` tab. Click `“Apply & Restart”`.
- With that setting, you can close, open whatever you want and it **will not open always** when you turn on your computer anymore.

You can do step by step as I showed in [Instruction](#instruction) section.


<a name="before-you-begin"></a>
### 🔔 Before you begin
If you are new in Git, Github and new in Spring Boot configuration structure, <br>
You should see basic detail instructions first in here [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction)<br>
If you are not good enough in basic API knowledge with Java Spring Boot, Docker Basic and other spring basic knowledge, you should learn below example projects first. <br>
Click below links.
* [Spring Boot Sample CRUD Application](https://github.com/yewin-mm/spring-boot-sample-crud) (for sample CRUD application)
* [Reading Values from Properties files](https://github.com/yewin-mm/reading-properties-file-values) (for reading values from properties files)
* [Spring Boot Docker Sample](https://github.com/yewin-mm/spring-boot-docker-sample)



<a name="clone-project"></a>
### 🥡 Clone Project
* Clone the repo
   ```sh
   git clone https://github.com/yewin-mm/spring-boot-docker-compose-sample.git
   ```
<a name="prerequisites"></a>
### 🔑 Prerequisites
Prerequisites can be found in here [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction). <br>
You need to install `Docker` in your machine. [Get Docker](https://www.docker.com/products/docker-desktop/). <br>
You need to learn sample dockerized application by using `Dockerfile` first. [Spring Boot Docker Sample](https://github.com/yewin-mm/spring-boot-docker-sample)


<a name="instruction"></a>
### 📝 Instruction
* `docker-compose.yml` file read `Dockerfile`. So, your application should have `Dockerfile`.
* For more details about `Dockerfile`, you can find in here. [Spring Boot Docker Sample](https://github.com/yewin-mm/spring-boot-docker-sample)
* Go to your application folder with command prompt CMD (for window) or Terminal (for Mac and Linux) or you can also open your IDE Terminal while you opening the project with your IDE.
* Below commands need to type in your `CMD` or `Terminal` where path should be in your application folder.
* Generate jar file
  * Type -> `mvn clean package` or you can type `mvn clean package -DskipTests=true` for skipping test for unnecessary compile time error.
  * You can also type `mvn clean install` or `mvn clean install -DskipTests=true` for skipping compile time error.
* Check docker version to make sure your installed docker is up or down by typing `docker --version`,
* Build image and run application as container
  * Before do below command,
    * Please make sure Docker Desktop (Docker service) is open in your machine.
    * Please make sure your generated jar file (generate with above `mvn clean package`) is under target folder.
    * Because `docker-compose.yml` file will run application, and it will read `Dockerfile` to build image and do process as per `Dockerfile`, So, if your jar file name is not same with inside jar file name of `Dockerfile`, you can't create image.
    * Please make sure your jar file name under target folder and jar file name in COPY keyword of `Dockerfile` **must be same**.
  * If all are ok, create image and run your application as container by below command.
  * Type
  * ```sh
    docker-compose up -d
    ```
  * `up` is to build image and run this application as container
  * `-d` option is to hide log and run in background. 
    * You can remove `-d` option when you want to test your application is running well by checking logs
    * You can also check container logs without removing `-d` option by typing `docker logs -f -n 200 {container_id}`, here, `-n 200` is line number.<br> But I recommend to use with `-d` option when you run your application.

  * You can check your created docker images with below command.
  * ```sh
    docker images
    ```
  * Here, If created, you can see Repository name (image name), Tag (version), Image Id, Created date, etc.
  * If not created, you need to check Dockerfile like jar file name is same with target folder and your CMD or terminal path is under project directory or not.

* Check container
  * Type (check running containers)
      ```sh
      docker ps
    
  * Here, you can see Container Id, Image name, etc.

  * Type (check all containers including running container, not running container, unsuccessful running container)
    ```sh
    docker ps -a
    
* After application was running well as container, you can test application is alive or not by calling api which I added in this demo-application. <br> 
 Call `http://localhost:8080/spring-boot-docker-compose-sample/getHello` via Browser or Postman.

* If your application is not running well when application was started up, you can check logs by removing `-d` to appear log to check error in CMD or Terminal like below. <br>
  * run without detached mode `docker-compose up` <br>
  * you can stop (terminate) application by pressing Ctrl+C when you run application without detached mode.
  * I recommend to run with `-d` option after checking error.

* If you run application with detached mode and if you want to stop application, you can stop container. (if not with `-d` option, you can `ctrl+c` to stop container)
* Please note that If you don't stop container, your application container will run background the whole time.
* So, you need to stop your application if your application is not go live for the whole time.
  * Type
    ```sh
    docker-compose down
    ```
  * `down` option will remove container too.
  * If you don't use `docker-compose` file and if you use dockerfile only, you need to stop by `docker stop {container_id}` and for that case you need container id.
  * You can also use `docker stop {container_id}` command, but for that case, container will remain as stopped container (not remove), and it will take a bit space on docker.
  * `docker-compose down` don't need container id. It will remove your container and associated network also. 
  * Please note that, docker compose file will create default `network` for your application, you can test it by typing `docker network ls` after docker compose was up.
  * I've dropped test network in `docker-compose.yml` file as comment code, and you can check it out. 
  * So, that `down` option will clear your stopped container and application running network, and it's the good thing to remove stopped/no use container.
  * So, that is one of the good approach using `docker-compose` file and `docker-compose down` keyword.

* If you want to start or restart the application next time, you can start application easily with below command.
  * Type
    ```sh
    docker-compose up -d
    ```
  * Docker compose will use existing image and if not existed image, it will automatically create.
 
* If you did some changes in your application, 
* You need to regenerate jar file by `mvn clean package` or `mvn clean package -DskipTests=true`.
* And if you type `docker-compose up -d` to run application, you don't get the update even you already regenerate jar file.
* This is because `docker-compose` will use `existing created image` which is build from old jar file.
* So, you need to recreate image by below command.

  * Type
    ```sh
    docker-compose up --build -d
    ```

  * `--build` will re-create image. (Please note that don't forget to re-generate jar file first by `mvn clean package` or `mvn clean package -DskipTests=true`).

* If you want to check running application logs or your output log values, you can type docker logs option.
  * Type 
    ```sh
    docker logs -f -n 200 {container_id}
    ```
  * Here, -f mean follow the logs for upcoming logs and -n mean line number follow by number of lines to reduce appearing huge amount of logs.
  * You can reference for more details about logs in [Docker official log documentation](https://docs.docker.com/engine/reference/commandline/logs/) or you can find usage in google.
  * You can exit following logs by clicking `Ctrl+c`.

* If you want to delete your application image, you need to stop and delete container (but if you use, `docker-compose down`, it will remove(delete) container)
* So, no need to manual remove (delete) container to removing image if you use `docker-compose down`.
    ```sh
    docker rmi {image_id}
    ```
  * here, you can get your application image id by typing `docker images`.

* If you get exception error for successful running application, or if you want to check your application inside container, <br>
 you can either go inside into container for seeing logs, jar file as your path, folder, etc. Every application has own containers.
* To go inside your application container
  * Type
      ```sh
      docker exec -it {container_id} /bin/bash
   
  * You can also type `docker exec -it {container_id} /bin/sh` or `docker exec -it {container_id} bash`
  * here, you can get your application container id by typing `docker ps`. 
  * If container is not up (not running), you can't go inside container.
  * here, you can leave inside docker container by typing `exit` inside container.
  
* Check Docker disk space as some unnecessary images and unused containers may take much space
  * Type 
    ```sh
    docker system df
    ```
  * For more commands like, cleaning unused containers, images, get inside container, logging, deleting container, image
  * you can find in here, [Dockerized Application Sample Commands](https://github.com/yewin-mm/spring-boot-docker-sample/blob/master/README.md#instruction)

* Read `Dockerfile` and `docker-compose.yml` file again under application folder path carefully and see the comment in there.

* You can call `http://localhost:8080/spring-boot-docker-compose-sample/getHello` via Browser or Postman for testing purpose for application is running well inside container or not.

* After that you can see the code and check the code and `docker-compose.yml` file and `Dockerfile` which you don't know. You can learn it, and you can apply in your job or study fields.

***Have Fun and Enjoy in Learning Code***


<a name="contact"></a>
## ✉️ Contact Me
Name - Ye Win <br> LinkedIn profile -  [Ye Win](https://www.linkedin.com/in/ye-win-1a33a292/)  <br> Email Address - <a href="mailto:yewin.mmr@gmail.com?">yewin.mmr@gmail.com</a> <br> WhatsApp - [+959252656065](https://wa.me/959252656065?text=Hi) <br> Website - [My Website](https://yewin.me/)

Project Link: [Spring Boot Docker Compose Sample](https://github.com/yewin-mm/spring-boot-docker-compose-sample)


<a name="becoming-a-sponsor"></a>
## 🥰 Becoming a Sponsor
If you like any of my projects or if you want to support my work, please kindly consider becoming a sponsor. <br>
It gives me great motivation and I can relentlessly maintain my projects and contribute to the open-source community.

<a href="https://www.buymeacoffee.com/yewin" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" width="150" ></a>


<a name="contributing"></a>
## ⭐ Contributing
Contributions are what make the open source community such an amazing place to be learnt, inspire, and create. Any contributions you make are **greatly appreciated**.
<br>If you want to contribute....
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/yourname`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeatures'`)
4. Push to the Branch (`git push -u origin feature/yourname`)
5. Open a Pull Request
