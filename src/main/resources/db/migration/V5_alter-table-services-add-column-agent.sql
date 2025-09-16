ALTER TABLE services
ADD COLUMN agent_id bigint;

ALTER TABLE services
ADD CONSTRAINT fk_services_agent_id
FOREIGN KEY (agent_id) REFERENCES agents(id)
ON DELETE SET NULL;