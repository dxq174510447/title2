FROM docker.yihecloud.com/base/tomcat:2.0

MAINTAINER remoting <dengxiaoqian@qq.com>

COPY startup.sh /startup.sh
COPY target/title-one-0.0.1-SNAPSHOT.jar  /data/title-one-0.0.1-SNAPSHOT.jar
COPY src/main/java/yihecloud/base/title_one/App.java /prog2.java

RUN chmod u+x /startup.sh

