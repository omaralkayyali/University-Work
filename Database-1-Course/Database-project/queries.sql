
SELECT p.product_id, p.product_name, p.price, c.category_name, s.supplier_name
FROM products p
JOIN categories c ON p.category_id = c.category_id
JOIN suppliers s ON p.supplier_id = s.supplier_id
ORDER BY p.product_id;

SELECT c.customer_id, c.first_name || ' ' || c.last_name AS customer_name,
       COUNT(o.order_id) AS total_orders_placed,
       SUM(o.total_amount) AS total_money_spent
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name
ORDER BY total_money_spent DESC;

SELECT c.category_name,
       COUNT(p.product_id) AS number_of_products,
       AVG(p.price) AS average_product_price
FROM categories c
LEFT JOIN products p ON c.category_id = p.category_id
GROUP BY c.category_name
ORDER BY number_of_products DESC;

SELECT s.supplier_name, COUNT(p.product_id) AS high_value_products_count
FROM suppliers s
JOIN products p ON s.supplier_id = p.supplier_id
WHERE p.price >= 15.00
GROUP BY s.supplier_name
ORDER BY high_value_products_count DESC;

SELECT product_name, price, stock_quantity
FROM products
WHERE stock_quantity > 0
ORDER BY price DESC;