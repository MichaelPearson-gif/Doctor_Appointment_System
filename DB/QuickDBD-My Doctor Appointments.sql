
CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    email VARCHAR NOT NULL,
    profilePic BYTEA,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    gender VARCHAR,
    phone INT,
    address INT REFERENCES address(address_id),
    user_role INT REFERENCES roles(role_id),
    dob DATE NOT NULL,
    user_password VARCHAR NOT NULL
);

CREATE TABLE roles (
    role_id INT PRIMARY KEY,
    user_role VARCHAR NOT NULL
);

CREATE TABLE address (
    address_id SERIAL PRIMARY KEY,
    street VARCHAR NOT NULL,
    city VARCHAR NOT NULL,
    state VARCHAR NOT NULL,
    zipcode INT NOT NULL,
    apt VARCHAR NOT NULL
);

CREATE TABLE bill (
    invoice_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES users(user_id),
    total NUMERIC NOT NULL,
    status VARCHAR NOT NULL,
    today DATE NOT NULL,
    due_date DATE NOT NULL
);

CREATE TABLE appointment (
    appointment_id SERIAL PRIMARY KEY,
    schedule TIMESTAMP,
    patient INT REFERENCES users(user_id),
    doctor INT NOT NULL REFERENCES users(user_id),
    status VARCHAR NOT NULL
);

CREATE TABLE "patient_doctor" (
	pd_id SERIAL PRIMARY KEY,
    patient INT NOT NULL REFERENCES users(user_id),
    doctor INT NOT NULL REFERENCES users(user_id)
);

-- In case of major restructuring
DROP TABLE users CASCADE;
DROP TABLE roles CASCADE;
DROP TABLE address CASCADE;
DROP TABLE bill CASCADE;
DROP TABLE appointment CASCADE;
DROP TABLE patient_doctor CASCADE;

