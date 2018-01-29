CREATE TABLE user_announcment (
announcement_id INT UNSIGNED NOT NULL,
user_id INT UNSIGNED NOT NULL,
FOREIGN KEY (announcement_id) REFERENCES announcement(id),
FOREIGN KEY (user_id) REFERENCES user(id)
);