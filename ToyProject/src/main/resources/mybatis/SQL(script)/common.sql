
CREATE TABLE COMM001
(

	CODE	VARCHAR(4)		NOT NULL,
	CATEGORY VARCHAR(20) 	NOT NULL,	
	CONTENT	VARCHAR(20)	,
	CONSTRAINT COMM_PK PRIMARY KEY (CODE));



CREATE TABLE USERS 
(       
    USER_NO     INTEGER(10)      NOT NULL, -- 회원고유번호
    USER_ID     VARCHAR(50)    NOT NULL, -- 아이디
    USER_PW     VARCHAR(6)     NOT NULL, -- 비밀번호
    USER_NAME   VARCHAR(20)    NOT NULL, -- 이름
         SEX CHAR(1) NOT NULL,
    BIRTH       VARCHAR(10)    NOT NULL, -- 생년월일
    EMAIL       VARCHAR(20)    NOT NULL, -- 이메일
    PHONE_NO    VARCHAR(20)    NOT NULL, -- 핸드폰번호
    USER_ZCODE  VARCHAR(20)    NOT NULL, -- 우편번호?
    ADDR1       VARCHAR(50)    NOT NULL, -- 주소상세1 API 확인 필요
    ADDR2       VARCHAR(50)    NOT NULL, -- 주소상세2
    CREATEDATE  DATE            NOT NULL, -- 가입날짜
    UPDATEDATE  DATE            NOT NULL,         -- 업데이트 날짜? 
    LASTLOGIN   DATE            NOT NULL, -- 마지막 접속 날짜
    USER_USE    CHAR(1)         NOT NULL, -- 아이디 사용 여부
    CART        VARCHAR(50)    ,         -- 장바구니
    CODE        VARCHAR(4)     NOT NULL, -- 권한
    
     CONSTRAINT USER_PK PRIMARY KEY (USER_NO,USER_ID),
     CONSTRAINT ROLE_CODE FOREIGN KEY(CODE) REFERENCES COMM001(CODE)
); 












  
CREATE TABLE PRODUCT
(
    PRODUCT_NO        VARCHAR(20)      NOT NULL, 
    PRODUCT_ID        VARCHAR(20)      NULL, 
    PRODUCT_NAME      VARCHAR(20)      NULL, 
    PUBLISHER         VARCHAR(20)      NULL, 
    PRODUCT_STATUS    VARCHAR(5)       NULL, 
    PRODUCT_PRICE    INTEGER           NULL, 
    CATEGORYS          VARCHAR(4)       NULL, 
    QUANTITY          INTEGER            NULL, 
    DETAIL            VARCHAR(2000)    NULL, 
    IMAGE             VARCHAR(2000)    NULL, 
    PRODUCT_RATING    INTEGER            NULL, 
    SALES_QUANTITY    INTEGER           NULL, 
    AUTHOR            VARCHAR(20)      NULL, 
    CONSTRAINT PRODUCT_PK PRIMARY KEY (PRODUCT_NO)
);


COMMIT;