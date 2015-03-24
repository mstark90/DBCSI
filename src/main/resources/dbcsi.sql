DROP TABLE IF EXISTS query_log;
DROP TABLE IF EXISTS column_locks;
DROP TABLE IF EXISTS email_addresses;
DROP TABLE IF EXISTS users;

CREATE TABLE users
    (user_id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
     user_name VARCHAR(255) NOT NULL,
     password VARCHAR(70) NOT NULL,
     first_name VARCHAR(200) NOT NULL,
     last_name VARCHAR(200) NOT NULL,
     enabled BIT NOT NULL DEFAULT 1);

CREATE TABLE email_addresses
    (email_address_id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
     user_id BIGINT NOT NULL,
     email_address VARCHAR(510) NOT NULL,
     FOREIGN KEY (user_id) REFERENCES users (user_id));

CREATE TABLE column_locks
    (column_lock_id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
     user_id BIGINT NOT NULL,
     schema_name VARCHAR(510) NOT NULL,
     table_name VARCHAR(510) NOT NULL,
     column_name VARCHAR(510) NOT NULL,
     enabled BIT NOT NULL DEFAULT 1,
     FOREIGN KEY (user_id) REFERENCES users (user_id));

CREATE TABLE query_log
    (log_id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
     column_lock_id BIGINT NOT NULL DEFAULT 0,
     query MEDIUMTEXT NOT NULL);