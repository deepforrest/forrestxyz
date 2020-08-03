DROP TABLE user CASCADE CONSTRAINTS;
CREATE TABLE user(
    username VARCHAR2 PRIMARY KEY,
    password VARCHAR2,
    first VARCHAR2,
    last VARCHAR2
);

DROP TABLE balance CASCADE CONSTRAINTS;
CREATE TABLE balance(
    username VARCHAR2 PRIMARY KEY,
    balance INTEGER,

CONSTRAINT balance_user_fk FOREIGN KEY (username) REFERENCES user(username)

);

DROP TABLE transaction CASCADE CONSTRAINTS
CREATE TABLE transaction(
    index INTEGER PRIMARY KEY,
    username VARCHAR2,
    amount INTEGER,
    date DATE,

    CONSTRAINT transaction_user_fk FOREIGN KEY (username) REFERENCES user(username)
);

DROP TABLE deposit CASCADE CONSTRAINTS
CREATE TABLE deposit(
    index INTEGER PRIMARY KEY,
    username VARCHAR2,
    amount INTEGER,
    date DATE,

    CONSTRAINT deposit_user_fk FOREIGN KEY (username) REFERENCES user(username)
);