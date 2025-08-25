CREATE TABLE users(

    id bigint NOT NULL auto_increment,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,

    PRIMARY KEY(id)
);
