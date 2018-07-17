DROP TABLE product;

CREATE TABLE product (
    productid         NUMBER(7) PRIMARY KEY NOT NULL,
    productfname       VARCHAR2(255) NOT NULL,
    productshortname    VARCHAR2(255) NOT NULL UNIQUE,
    productdept      VARCHAR2(255) NOT NULL,
    prdtype         VARCHAR2(255) NOT NULL,
    producttype      VARCHAR2(255) NOT NULL,
    productdesc   VARCHAR2(255) NOT NULL,
    isprototype     NUMBER(1) NOT NULL
);

DROP SEQUENCE PID_SEQUENCE;
CREATE SEQUENCE PID_SEQUENCE;

select * from product;

CREATE OR REPLACE PROCEDURE CREATE_PRODUCT (PFNAME IN VARCHAR2, PSHORTNAME IN VARCHAR2, 
    PDEPT IN VARCHAR2, PRDTYPE IN VARCHAR2, PTYPE IN VARCHAR2, PDESC IN VARCHAR2, ISP IN NUMBER)
AS BEGIN
INSERT INTO PRODUCT VALUES(PID_SEQUENCE.NEXTVAL, PFNAME, PSHORTNAME, PDEPT, PRDTYPE, PTYPE, PDESC, ISP);
COMMIT;
END;
/

