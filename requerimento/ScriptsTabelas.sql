CREATE TABLE pessoa (
  id VARCHAR(100) NOT NULL,	
  senha VARCHAR(40) NOT NULL,
  nome VARCHAR(100) ,
  curso VARCHAR(50) ,
  tipo  varchar(1), 
  PRIMARY KEY(id)
);

CREATE TABLE curso (
  codigo INTEGER auto_increment,
  nome VARCHAR(100),	
  tia VARCHAR(40),
  curso VARCHAR(40),
  extra VARCHAR(40),
  status VARCHAR(40) ,
  parecer VARCHAR(200),	
  PRIMARY KEY(codigo)
);

