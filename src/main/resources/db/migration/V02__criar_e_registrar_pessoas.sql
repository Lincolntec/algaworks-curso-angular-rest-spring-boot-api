CREATE TABLE pessoa(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo BOOLEAN,
	logradouro VARCHAR(50),
	numero VARCHAR(4),
	complemento VARCHAR(50),
	bairro VARCHAR(30),
	cep VARCHAR(12),
	cidade VARCHAR(30),
	estado VARCHAR(30)
	

)ENGINE=InnoDB DEFAULT CHARSET=utf8;

	INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('Alcino José Lincoln de Souza', true, 'Rua: Ana Jacinta de Andrade couto', '207','', 'Parque Industrial', 
			'13031-400', 'Campinas', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('Bruno Otavio', true, 'Rua: Luciano Xavier de Oliveira', '300', '','Vila Anhanguera', 
			'13031-835', 'Campinas', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('Bruna Cristina Medeiros', true, 'Rua: Luciano Xavier de Oliveira', '750','', 'Vila Anhanguera', 
			'13031-835', 'Campinas', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('Fabio Hyrata', true, 'Rua: Martelinho', '300', '','Parque Industrial', 
			'13031-835', 'Campinas', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('João Paulo', true, 'AV: Francisco Glicerio', '1300','', 'Centro', 
			'13031-405', 'Campinas', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('Felipe Luiz', true, 'Rua: Magalhaes Teixeira ', '5300','', 'Vila Teixeira', 
			'13031-735', 'Campinas', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('Victoria Albuquerque de Souza', true, 'Rua: Barão de Parnaiba', '770','', 'Taquaral', 
			'13031-135', 'Campinas', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('Dorotea Aparecida Lourdes de Souza', true, 'Rua: Luciano Xavier de Oliveira', '80','', 'Vila Anhanguera', 
			'13031-835', 'Campinas', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('Elaine Araujo', true, 'Rua: Felipe Cantusio', '4400','', 'Parque Industrial', 
			'13031-565', 'Campinas', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
		values ('Caelum', true, 'Rua: Matarazo', '300', '','Vila Mariana', 
			'13031-777', 'São Paulo', 'São Paulo');
	

