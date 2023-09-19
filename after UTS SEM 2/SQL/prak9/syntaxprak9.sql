CREATE DATABASE dbakademik;
USE dbakademik;
CREATE TABLE Admin_2221026(
idadmin VARCHAR(30) PRIMARY KEY,
namaadmin VARCHAR(30),
PASSWORD CHAR(32)
)ENGINE INNODB;
INSERT INTO Admin_2221026 (idadmin, namaadmin, PASSWORD) VALUES (1, 'chairul', 2221026);


CREATE DATABASE dbakademik
USE dbakademik;
CREATE TABLE Mahasiswa_2221026(
NimMhs CHAR(7) PRIMARY KEY,
NamaMhs VARCHAR(30),
Tempatlahir VARCHAR(30),
Tanggallahir DATE,
Nohp VARCHAR(30),
Alamat VARCHAR(30),
JenisKelamin VARCHAR(30),
Namaortu VARCHAR(30),
Fakultas VARCHAR(30),
Prodi VARCHAR(30)
)ENGINE INNODB;

USE dbakademik;
CREATE TABLE Matakuliah_2221026(
Kodemtk CHAR(10) PRIMARY KEY,
Namamtk VARCHAR(100),
Sks INT
)ENGINE INNODB;

USE dbakademik;
CREATE TABLE Krs_2221026(
Krsid INT PRIMARY KEY,
Krstglisi DATE,
Krssem INT,
Krsnobp CHAR(7),
Krskodemtk CHAR(10),
Krsnilai CHAR(1),
FOREIGN KEY (Krsnobp) REFERENCES Mahasiswa_2221026(NimMhs),
FOREIGN KEY (Krskodemtk) REFERENCES Matakuliah_2221026(Kodemtk)
)ENGINE INNODB;