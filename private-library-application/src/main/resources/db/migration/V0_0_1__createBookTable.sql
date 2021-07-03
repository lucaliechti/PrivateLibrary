CREATE TABLE book (
    id serial PRIMARY KEY,
    name varchar(255) NOT NULL,
    author varchar(255) NOT NULL,
    language varchar(2),
    status varchar(20)
);

INSERT INTO book (name, author, language, status) VALUES ('Austerlitz', 'W. G. Sebald', 'de', 'AVAILABLE');
INSERT INTO book (name, author, language, status) VALUES ('Sand', 'Wolfgang Herrndorf', 'de', 'LENT');
INSERT INTO book (name, author, language, status) VALUES ('Die Fälschung', 'Nicolas Born', 'de', 'AVAILABLE');
