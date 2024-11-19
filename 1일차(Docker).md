# Docker
- Go언어로 작성된 리눅스 컨테이너 기반으로하는 오픈소스 가상화 플랫폼

## Docker의 장점
- DevOps : 개발과 운영의 호환성 증가
- 속도 개선 : Guest OS 계층이 없기에 가볍고, 빠른 성능
- 비종송적 플랫폼 : 컨테이너는 운영체제 커널에 상관없이 실행
- 개발환경 : 개발자에게 자유로운 개발을 할 수 있는 환경 보장

## Docker의 구성요소
### 이미지
어떤 애플리케이션을 실행하기 위한 환경으로, 애플리케이션을 실행하기 위한 파일들을 모아놓고, 애플리케이션과 함께 이미지로 만듭니다.

그리고 이 이미지를 기반으로 애플리케이션을 배포합니다. 쉽게 말해, 필요한 프로그램과 라이브러리, 소스를 설치한 뒤 파일로 만든 것

### 컨테이너
이미지는 파일들의 집합이고, 컨테이너는 이 파일들의 집합 위에서 실행된 특별한 프로세스입니다. 

개별 실행에 필요한 실행 환경을 독립적으로 운용할 수 있도록 다른 환경의 간섭을 막고 실행의 독립성을 확보해주는 운영체계 수준의 격리 기술

### LXC(Linux Containers)
고유의 파일 시스템, 프로세스, 네트워크 공간을 가짐

### 도커 엔진
사용자가 컨테이너를 생성하고 사용할 수 있도록 함

### 도커 허브
도커에서 제공하는 이미지 호스팅 서비스로 다양한 이미지들이 등록되어 있음.

### 중요개념
이미지는 컨테이너 실행에 필요한 파일과 설정값등을 포함하고 있는 것으로 상태값을 가지지않고 변하지 않습니다.

컨테이너의 상태가 바뀌거나 컨테이너가 삭제되더라도 이미지는 변하지 않고 그대로 남아있습니다.

새로운 서버가 추가되면 미리 만들어 놓은 이미지를 다운받고 컨테이너를 생성만 하면 됩니다.

한 서버에 여러개의 컨테이너를 실행할 수 있습니다.


## Docker 기본 명령어
- Docker 버전 확인
 > docker --version
 > 
 > docker -v

- Docker Hub에 있는 Repository의 이미지 내려받기
 > docker pull [이미지명:태그명]
 > 
 > ex) docker pull ubuntu:latest  # 태그 = 버전

- Docker Container 생성
 > docker run [옵션] [컨테이너명] [이미지]
 > 
 > ex) docker run -it -d --name ubuntu ubuntu:latest
 > 
 > 옵션
  >> -it = 터미널(예시: cmd)을 통한 입력을 위한 옵션
  >> 
  >> -d = 백그라운드 실행을 위한 옵션
  >> 
  >> --name ubuntu = 컨테이너 이름 설정

- Docker Container 목록 출력
 > docker ps -a

- Docker Container에서 CLI명령어 사용
 > docker exec [옵션] [컨테이너 이름] [CLI 명령어]
 >
 > ex) docker exec -it [컨테이너 이름] bash

- 실행 된 Docker Container 정지
 > docker stop [컨테이너 이름]

- 실행 된 Docker Container를 Image로 만들기
 > docker commit [컨테이너 이름] [사용자명/이미지명]

- Docker Hub Repository에 이미지를 올릴때 사용
 > docker push [사용자명/이미지명]

- 로컬에 저장된 Docker Image 목록
 > docker images

## Docker Compose
    services:
      java:
        image: openjdk:21-jdk
        container_name: java
        restart: always
        volumes:
          - ../work:/usr/local/java:rw
        environment:
          - TZ=Asia/Seoul
          - LC_ALL:en_US.UTF-8
        command: sleep infinity

- image: 사용할 Docker 이미지를 openjdk:21-jdk로 지정합니다.

- container_name: java라는 이름을 부여하여 컨테이너를 쉽게 식별할 수 있습니다.

- restart: always로 설정하여 컨테이너가 종료되면 항상 재시작됩니다.

- volumes: 호스트의 ../work 디렉토리를 컨테이너의 /usr/local/java로 마운트하여 파일을 공유합니다. rw는 읽기/쓰기 권한을 부여합니다.

- environment: 환경 변수를 설정하여:
  - TZ=Asia/Seoul로 서울 시간대를 사용하고,
  - LC_ALL=en_US.UTF-8로 로케일을 영어(미국)으로 설정합니다.

- command: sleep infinity 명령을 사용하여 컨테이너가 무한히 실행되도록 설정합니다.


[참조 문서](https://github.com/JosephBean/Docs/tree/main/docker)




