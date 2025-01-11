CREATE TABLE configurations
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    logo_url     VARCHAR(255),
    company_name VARCHAR(255) NOT NULL,
    address      VARCHAR(255),
    facebook_url VARCHAR(255),
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);