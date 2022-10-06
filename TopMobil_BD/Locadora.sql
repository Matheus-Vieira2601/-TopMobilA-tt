create schema Locadora;

create table Locadora.Veiculo(
	idVeiculo int not null primary key,
	placa varchar(8) unique,
	modelo varchar(50),
	cor varchar(30),
	ano varchar(4),
);

create table Locadora.Cliente(
	idCliente int not null primary key,
	cpf varchar(15) unique,
	rg varchar(15) unique,
	email varchar(100) unique,
	nome varchar(40),
	endereco varchar(60),
	telefone varchar(15),
);

create table Locadora.Locacao(
	idLocacao int not null primary key,
	idCliente int not null,
	idVeiculo int not null,
	foreign key (idCliente) references Locadora.Cliente(idCliente),
	foreign key (idVeiculo) references Locadora.Veiculo(idVeiculo),
)

create table Locadora.Vendedor(
	idVendedor int not null primary key,
	cpf varchar(15) unique,
	rg varchar(15) unique,
	email varchar(100) unique,
	nome varchar(40),
	endereco varchar(60),
	telefone varchar(15),
);

create table Locadora.Compra(
	idCompra int not null primary key,
	idCliente int not null,
	idVendedor int not null,
	foreign key (idCliente) references Locadora.Cliente(idCliente),
	foreign key (idVendedor) references Locadora.Vendedor(idVendedor),
);

create table Locadora.Venda(
	idVenda int not null primary key,
	idVendedor int not null,
	idVeiculo int not null,
	foreign key (idVeiculo) references Locadora.Veiculo(idVeiculo),
	foreign key (idVendedor) references Locadora.Vendedor(idVendedor),
)