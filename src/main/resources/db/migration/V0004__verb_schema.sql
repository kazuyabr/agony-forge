CREATE TABLE verb (
    name VARCHAR(191) NOT NULL,
    bean VARCHAR(191) NOT NULL,
    priority INT NOT NULL,
    quoting BOOLEAN DEFAULT FALSE,
    PRIMARY KEY (name)
) ENGINE=InnoDB CHARACTER SET=utf8mb4, COLLATE=utf8mb4_unicode_ci;
