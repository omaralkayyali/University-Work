
DROP TABLE orders CASCADE CONSTRAINTS;
DROP TABLE products CASCADE CONSTRAINTS;
DROP TABLE customers CASCADE CONSTRAINTS;
DROP TABLE suppliers CASCADE CONSTRAINTS;
DROP TABLE categories CASCADE CONSTRAINTS;
CREATE TABLE categories (
    category_id   NUMBER(5) NOT NULL,
    category_name VARCHAR2(50) NOT NULL,
    CONSTRAINT pk_categories PRIMARY KEY (category_id)
);

CREATE TABLE suppliers (
    supplier_id   NUMBER(5) NOT NULL,
    supplier_name VARCHAR2(100) NOT NULL,
    phone         VARCHAR2(20),
    email         VARCHAR2(100),
    CONSTRAINT pk_suppliers PRIMARY KEY (supplier_id)
);

CREATE TABLE products (
    product_id     NUMBER(5) NOT NULL,
    product_name   VARCHAR2(100) NOT NULL,
    price          NUMBER(8, 2) NOT NULL,
    stock_quantity NUMBER(5) DEFAULT 0,
    category_id    NUMBER(5),
    supplier_id    NUMBER(5),
    CONSTRAINT pk_products PRIMARY KEY (product_id),
    CONSTRAINT fk_prod_category FOREIGN KEY (category_id) REFERENCES categories(category_id),
    CONSTRAINT fk_prod_supplier FOREIGN KEY (supplier_id) REFERENCES suppliers(supplier_id),
    CONSTRAINT chk_product_price CHECK (price > 0)
);

CREATE TABLE customers (
    customer_id NUMBER(5) NOT NULL,
    first_name  VARCHAR2(50) NOT NULL,
    last_name   VARCHAR2(50) NOT NULL,
    email       VARCHAR2(100),
    phone       VARCHAR2(20),
    CONSTRAINT pk_customers PRIMARY KEY (customer_id),
    CONSTRAINT uq_customer_email UNIQUE (email)
);

CREATE TABLE orders (
    order_id     NUMBER(5) NOT NULL,
    order_date   DATE DEFAULT SYSDATE,
    total_amount NUMBER(8, 2) NOT NULL,
    customer_id  NUMBER(5),
    CONSTRAINT pk_orders PRIMARY KEY (order_id),
    CONSTRAINT fk_orders_customer FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    CONSTRAINT chk_total_amount CHECK (total_amount >= 0)
);

INSERT INTO categories VALUES (101, 'Scout Uniforms');
INSERT INTO categories VALUES (102, 'Camping Gear');
INSERT INTO categories VALUES (103, 'Scout Badges');
INSERT INTO categories VALUES (104, 'Scout Ropes');
INSERT INTO categories VALUES (105, 'Footwear');
INSERT INTO categories VALUES (106, 'Backpacks');
INSERT INTO categories VALUES (107, 'Books and Manuals');
INSERT INTO categories VALUES (108, 'First Aid');
INSERT INTO categories VALUES (109, 'Lighting Tools');
INSERT INTO categories VALUES (110, 'Accessories');

INSERT INTO suppliers VALUES (201, 'Amman Scout Supplies', '0791111111', 'info@amman-scout.com');
INSERT INTO suppliers VALUES (202, 'Jordan Camping Co', '0782222222', 'sales@jocamping.com');
INSERT INTO suppliers VALUES (203, 'Adventure Village Gear', '0773333333', 'support@adventurev.com');
INSERT INTO suppliers VALUES (204, 'Global Badge Makers', '0794444444', 'contact@globalbadges.com');
INSERT INTO suppliers VALUES (205, 'Al-Hamam Textile', '0785555555', 'textile@marj.com');
INSERT INTO suppliers VALUES (206, 'Desert Trek Equipment', '0776666666', 'trek@desert.com');
INSERT INTO suppliers VALUES (207, 'Safety First Ltd', '0797777777', 'safety@first.com');
INSERT INTO suppliers VALUES (208, 'Elite Leather Goods', '0788888888', 'elite@leather.com');
INSERT INTO suppliers VALUES (209, 'Horizon Printing House', '0779999999', 'horizon@print.com');
INSERT INTO suppliers VALUES (210, 'Smart Outdoor Solutions', '0790000000', 'smart@outdoor.com');

INSERT INTO products VALUES (301, 'Official Scout Shirt', 15.50, 50, 101, 205);
INSERT INTO products VALUES (302, '4-Person Camping Tent', 85.00, 15, 102, 202);
INSERT INTO products VALUES (303, 'Woodcraft Badge', 2.00, 200, 103, 204);
INSERT INTO products VALUES (304, 'Nylon Pioneer Rope 10m', 7.25, 40, 104, 201);
INSERT INTO products VALUES (305, 'Leather Scout Boots', 45.00, 25, 105, 208);
INSERT INTO products VALUES (306, '65L Tactical Backpack', 60.00, 12, 106, 206);
INSERT INTO products VALUES (307, 'Scout Leader Handbook', 10.00, 30, 107, 209);
INSERT INTO products VALUES (308, 'Compact First Aid Kit', 18.00, 22, 108, 207);
INSERT INTO products VALUES (309, 'LED Headlamp Waterproof', 12.50, 35, 109, 210);
INSERT INTO products VALUES (310, 'Scout Scarf (Marj Al-Hamam)', 4.50, 150, 110, 205);


INSERT INTO customers VALUES (401, 'Omar', 'Al-Kayyali', 'omar@example.com', '0791234567');
INSERT INTO customers VALUES (402, 'Ahmad', 'Muhammad', 'ahmad@example.com', '0781234567');
INSERT INTO customers VALUES (403, 'Youssef', 'Ali', 'youssef@example.com', '0771234567');
INSERT INTO customers VALUES (404, 'Mustafa', 'Hassan', 'mustafa@example.com', '0797654321');
INSERT INTO customers VALUES (405, 'Zane', 'Tareq', 'zane@example.com', '0787654321');
INSERT INTO customers VALUES (406, 'Karam', 'Rami', 'karam@example.com', '0777654321');
INSERT INTO customers VALUES (407, 'Samer', 'Fadi', 'samer@example.com', '0790001112');
INSERT INTO customers VALUES (408, 'Hamza', 'Khaled', 'hamza@example.com', '0780001112');
INSERT INTO customers VALUES (409, 'Tareq', 'Ziad', 'tareq@example.com', '0770001112');
INSERT INTO customers VALUES (410, 'Laith', 'Sami', 'laith@example.com', '0799998887');

INSERT INTO orders VALUES (501, TO_DATE('2026-05-01', 'YYYY-MM-DD'), 15.50, 401);
INSERT INTO orders VALUES (502, TO_DATE('2026-05-03', 'YYYY-MM-DD'), 170.00, 402);
INSERT INTO orders VALUES (503, TO_DATE('2026-05-05', 'YYYY-MM-DD'), 4.00, 403);
INSERT INTO orders VALUES (504, TO_DATE('2026-05-10', 'YYYY-MM-DD'), 45.00, 404);
INSERT INTO orders VALUES (505, TO_DATE('2026-05-12', 'YYYY-MM-DD'), 120.00, 405);
INSERT INTO orders VALUES (506, TO_DATE('2026-05-15', 'YYYY-MM-DD'), 10.00, 401);
INSERT INTO orders VALUES (507, TO_DATE('2026-05-18', 'YYYY-MM-DD'), 18.00, 407);
INSERT INTO orders VALUES (508, TO_DATE('2026-05-20', 'YYYY-MM-DD'), 25.00, 408);
INSERT INTO orders VALUES (509, TO_DATE('2026-05-22', 'YYYY-MM-DD'), 7.25, 409);
INSERT INTO orders VALUES (510, TO_DATE('2026-05-25', 'YYYY-MM-DD'), 60.00, 401);

COMMIT;