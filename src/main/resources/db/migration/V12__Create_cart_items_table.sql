CREATE TABLE cart_items
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    cart_id    INT,
    product_id INT,
    quantity   INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (cart_id) REFERENCES cart (id),
    FOREIGN KEY (product_id) REFERENCES products (id)
);