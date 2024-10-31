CREATE DATABASE books_systems;

\connect books_systems;

CREATE TABLE books (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name CHARACTER VARYING(255) NOT NULL,
    CONSTRAINT os_name_uniq UNIQUE (name)
);

INSERT INTO books (name) VALUES ('The little prince'), ('Flow'), ('7 habits');