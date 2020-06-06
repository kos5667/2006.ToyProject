/*[sqlpus 프롬프트에서 아래와 같이 작성하여 설정을 변경해 준다.]*/
ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;

-- root로 로그인한 후 데이터베이스 생성
create database TP default CHARACTER SET UTF8;
show databases;
use mysql;
create user TP@localhost identified by '1234';
GRANT ALL PRIVILEGES ON TP.* TO TP@LOCALHOST;
------------------------------------------------