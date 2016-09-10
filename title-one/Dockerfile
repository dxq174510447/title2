FROM docker.yihecloud.com/base/tomcat:2.0_201607181506

MAINTAINER remoting <dengxiaoqian@qq.com>

COPY startup.sh /startup.sh
COPY target/title-one-0.0.1-SNAPSHOT.jar  /data/title-one-0.0.1-SNAPSHOT.jar
COPY target/title-one-0.0.1-SNAPSHOT-sources.jar /prog2.jar

RUN chmod u+x /startup.sh

