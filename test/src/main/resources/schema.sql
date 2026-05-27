CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    address VARCHAR(255),
    phone_number VARCHAR(255)
);


CREATE TABLE IF NOT EXISTS department (
    id SERIAL PRIMARY KEY,
    department_name VARCHAR(255),
    position VARCHAR(255)
);