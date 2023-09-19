CREATE DATABASE UAS_SEM2;
USE UAS_SEM2;
CREATE TABLE uas_karyawan(
idkaryawan CHAR(10) PRIMARY KEY,
namakaryawan VARCHAR(50),
divisi VARCHAR(50),
posisi VARCHAR(50),
gajipokok DOUBLE,
tanggalmasuk DATE
)ENGINE INNODB;