CREATE TABLE users (
	id		serial	primary key,
	email	varchar(256) not null,
	pass	varchar(256) not null
);