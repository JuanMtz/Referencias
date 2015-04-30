create database autores;

create table Autores (
Autorid int Primary Key,
Apellido_P varchar(20),
Apellido_M varchar (20),
Nombre varchar(20)
)


create table Publicaciones(
 Idp int primary key,
 Nombre varchar (100),
 Editorial varchar (50),
 Edición int,
 Lugar varchar (50),
 Año int,
 paginas varchar(10)
 )
 
 ALTER TABLE publicaciones
ADD CONSTRAINT FK_Autor_paper 
FOREIGN KEY (Autorid) REFERENCES Autores (Autorid) 

 
INSERT INTO `autores`.`autores` (`Autorid`, `Apellido_P`, `Apellido_M`) VALUES ('1', 'Baker ', 'BN');
INSERT INTO `autores`.`autores` (`Autorid`, `Apellido_P`, `Apellido_M`) VALUES ('2', 'Murphy ', 'DC');
INSERT INTO `autores`.`autores` (`Autorid`, `Apellido_P`, `Apellido_M`) VALUES ('3', 'Fisher ', 'D');
INSERT INTO `autores`.autores (Autorid, Apellido_P, Apellido_M) values ('4','Pinto','JK');
INSERT Into  autores.autores(Autorid, Apellido_P, Apellido_M) values ('5','Slevin','DP');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('6','Lecher','T');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('7','Kloppenborg', 'Tj');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('8','Ofter', 'WA');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('9','Morris', 'PWG');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('10','Oocnor', 'MM');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('11','Reinsborough', 'L');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('12','Spanish group', '');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('13','Cooke-Davies', 'TJ');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('14','De wit', 'A');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('15','Kaplan', 'RS');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('16','Kerzer', 'H');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('17','Gareis', 'R');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('18','Turner', 'JR');
INSERT INTO autores.autores(Autorid, Apellido_P, Apellido_M) values ('19', 'Dinsmore','P');



insert into autores.publicaciones(Idp, Nombre, Editorial, Edición, Lugar, Año, paginas, Autorid) values
('1','Factors affecting project management handbook','King WR editor', '2', 'New york', '1988', '','1');

insert into autores.publicaciones(Idp, Nombre, Editorial, Edición, Lugar, Año, paginas, Autorid) values
('2','Critical success factor accross the project life clicle','Project manager journal', '0', '', '1988', '67-65','4')

insert into autores.publicaciones(Idp, Nombre, Editorial, Edición, Lugar, Año, paginas, Autorid) values
('3','When it comes to project management, its the people tha matter','Thomas J editors', '0', 'University of calgary', '0', '205-15','6')





