
DROP TABLE IF EXISTS applicationUser;
CREATE TABLE applicationUser(id serial PRIMARY KEY, name VARCHAR(255), userName VARCHAR(255), contact numeric(10), email VARCHAR(255), password VARCHAR(255));