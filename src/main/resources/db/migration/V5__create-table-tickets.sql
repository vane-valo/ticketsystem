CREATE TABLE tickets(

    id serial,
    title VARCHAR(100) NOT NULL,
    user_id bigint NOT NULL,
    service_id bigint NOT NULL,
    creation_date DATE NOT NULL,
    description VARCHAR(250) NOT NULL,
    status_id bigint NOT NULL,
    attachment VARCHAR(100),
    resolution_time TIME,

    PRIMARY KEY(id),

    CONSTRAINT fk_tickets_user_id FOREIGN KEY(user_id) REFERENCES users(id),
    CONSTRAINT fk_tickets_service_id FOREIGN KEY(service_id) REFERENCES services(id),
    CONSTRAINT fk_tickets_status_id FOREIGN KEY(status_id) REFERENCES status(id)
);
