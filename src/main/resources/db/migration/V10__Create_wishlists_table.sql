CREATE TABLE wishlists
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    user_id    INT,
    product_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (product_id) REFERENCES products (id)
);