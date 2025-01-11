CREATE TABLE payments
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    order_id        INT,
    payment_type_id INT,
    amount          DECIMAL(10, 2),
    status          VARCHAR(50),
    created_at      TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at      TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (order_id) REFERENCES orders (id),
    FOREIGN KEY (payment_type_id) REFERENCES payment_types (id)
);