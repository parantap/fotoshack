CREATE TABLE IF NOT EXISTS user(username VARCHAR(20) NOT NULL, password varchar(20) NOT NULL, first_name varchar(20), last_name varchar(20), PRIMARY KEY (username));

INSERT INTO user (username, password, first_name, last_name) VALUES ('supermario', 'mario', 'mario', 'mario');