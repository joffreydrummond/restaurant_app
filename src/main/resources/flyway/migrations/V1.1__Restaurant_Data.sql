-- Customers
INSERT INTO customers (first_name, last_name, address, phone, email) VALUES ('Fred', 'Flintstone', '123 Bedrock Lane, Bedrock, AZ, 85032', '6235555555', 'fred@flintstone.com');
INSERT INTO customers (first_name, last_name, address, phone, email) VALUES ('Nick', 'Flintstone', '45673 N 75th Ave, Glendale, AZ, 85014', '4805555555', 'nick@flintstone.com');
INSERT INTO customers (first_name, last_name, address, phone, email) VALUES ('Joffrey', 'Flintstone', '3223 Morris Street, San Antonio, TX, 78205', '3605555555', 'joffrey@flintstone.com');
INSERT INTO customers (first_name, last_name, address, phone, email) VALUES ('Brandelyn', 'Flintstone', '15027 Pratt Avenue, San Antonio, TX, 77585', '7105555555', 'brandelyn@flintstone.com');

-- Foods
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Fried Calamari', 'APPETIZER', 'Breaded calamari, lightly fried in canola oil. Served with a side of marinara.', false, false, '6.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan, price) VALUES ('Garlic bread', 'APPETIZER', 'Garlic bread goes well with every meal', false, false, '1.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Chips and Salsa', 'APPETIZER', 'Chips and Salsa are always nice with your meal. Eat me.', true, false, '3.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Artichoke and Spinach Dip', 'APPETIZER', 'Tuscan bread served with a delicious blend of spinach', false, false, '4.49');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan, price) VALUES ('Ribeye Steak', 'ENTREE', 'Tasty ribeye steak covered in butter. Yum', false, false, '29.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan, price) VALUES ('Atlantic Salmon', 'ENTREE', 'Wild-caught Alaskan salmon stuffed with Bay Shrimp and Dungeness Crab', false, false, '15.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan, price) VALUES ('NY Strip Steak', 'ENTREE', 'Herb-marinated 12 ounce center-cut NY strip steak broiled with garlic butter.', false, false, '22.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Black Bean Burger', 'ENTREE', 'If you meat is not your thing, try this tasty black bean burger', false, true, '8.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Chicken with Wild Mushrooms', 'ENTREE', 'Tender roasted chicken, bathed in a rich cream sauce and served under a layer of wild mushrooms and garlic.', false, false, '13.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Fettuccine Alfredo', 'ENTREE', 'Fresh, house-made fettucine tossed in a thick and creamy Alfredo sauce.', false, false, '11.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Chicken Cordon Bleu', 'ENTREE', 'Chicken breasts filled with ham and swiss cheese, baked then finished with a supreme sauce', false, false, '15.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Molten Chocolate Lava Cake', 'DESSERT', 'Chocolate cake with vaniila ice cream and more chocolate syrup.', false, false, '5.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('White Chocolate Raspberry Cheesecake', 'DESSERT', 'Cheesecake made with white chocolate with a rasberry filling', false, false, '5.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Brownie Sundae', 'DESSERT', 'Simple brownie sundae always hits the spot. Served with ice cream.', false, false, '5.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Carrot cake', 'DESSERT', 'May taste delicious and make you talk like Bugs Bunny.', false, false, '5.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Long Island Ice Tea', 'ALCOHOL', 'Lots of alcohol mixed together. Gets you drunk.', false, false, '6.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Budweiser', 'ALCOHOL', 'This Bud is for you.', false, false, '4.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Sam Adams', 'ALCOHOL', 'Big bottle of Sam Adams', false, false, '4.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Margarita', 'ALCOHOL', 'You know you want a margarita. Drink me.', false, false, '6.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Strawberry Margarita', 'ALCOHOL', 'Margarita but strawberry version. Yum.', false, false, '6.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Vodka Red Bull', 'ALCOHOL', 'When you need energy in your alcohol. Vodka Red Bull gives you drunk wings.', false, false, '6.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Coca Cola', 'DRINK', 'Coca Cola on tap', false, false, '1.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Sprite', 'DRINK', 'Sprite on tap', false, false, '1.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Whole Milk', 'DRINK', 'Straight from the udder out back.', false, false, '1.99');
INSERT INTO foods (food_name, food_type, description, is_gluten_free, is_vegan,  price) VALUES ('Bottled Water', 'DRINK', 'Bottled water', false, false, '1.99');

-- Orders
INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) VALUES ('0', null, false, 'CARRYOUT', 1);
INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) VALUES ('0', null, false, 'DELIVERY', 1);
INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) VALUES ('0', null, false, 'CARRYOUT', 2);
INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) VALUES ('0', null, false, 'CARRYOUT', 3);
INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) VALUES ('0', null, false, 'DELIVERY', 3);
INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) VALUES ('0', null, false, 'DELIVERY', 3);
INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) VALUES ('0', null, false, 'DELIVERY', 4);
INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) VALUES ('0', null, false, 'CURBSIDE', 4);
INSERT INTO orders (price, order_date, order_filled, order_type, customer_id) VALUES ('0', null, false, 'CURBSIDE', 2);