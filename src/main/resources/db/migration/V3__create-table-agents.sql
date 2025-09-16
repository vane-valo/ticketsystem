CREATE TABLE agents(

    id serial,
    name VARCHAR(100) NOT NULL,
    service_id bigint NOT NULL,

    PRIMARY KEY(id),

    CONSTRAINT fk_agents_service_id FOREIGN KEY(service_id) REFERENCES services(id)
);
