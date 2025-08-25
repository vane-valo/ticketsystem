CREATE TABLE tickets(

    id bigint NOT NULL auto_increment,
    title VARCHAR(100) NOT NULL,
    user_id bigint NOT NULL,
    service_id bigint NOT NULL,
    creation_date datetime NOT NULL,
    description VARCHAR(250) NOT NULL,
    status_id bigint NOT NULL,
    attachment VARCHAR(100),
    resolution_time datetime,

    PRIMARY KEY(id),

    CONSTRAINT fk_tickets_user_id FOREIGN KEY(user_id) REFERENCES users(id),
    CONSTRAINT fk_tickets_service_id FOREIGN KEY(service_id) REFERENCES services(id),
    CONSTRAINT fk_tickets_status_id FOREIGN KEY(status_id) REFERENCES status(id)
);
