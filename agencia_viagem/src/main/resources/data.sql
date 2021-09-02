


DROP TABLE IF EXISTS AGENCIA;

CREATE TABLE AGENCIA(
	id int auto_increment primary key,
	nome varchar(50) not null,
	endereco varchar(100) not null,
	estah_aberta int not null,
	telefone varchar(20)
);


INSERT INTO AGENCIA(nome, endereco, estah_aberta, telefone) VALUES('Agencia Vix', 'Av.Vitoria', 1,'27 98836-3654');
INSERT INTO AGENCIA(nome, endereco, estah_aberta, telefone) VALUES('Agencia Serra', 'Av.Central, n° 47', 1, '27 97745-2365');
INSERT INTO AGENCIA(nome, endereco, estah_aberta, telefone) VALUES('Agencia Vila Velha', 'Av.Carioca, n°879', 1, '27 98845-6335');
INSERT INTO AGENCIA(nome, endereco, estah_aberta, telefone) VALUES('Agencia Cariacica', 'Av.Expedido Garcia, n°1504',1,'27 3289-0205');
INSERT INTO AGENCIA(nome, endereco, estah_aberta, telefone) VALUES('Agencia Viana', 'Av.Marcilio, n° 407', 1,'27 4005-3230');

