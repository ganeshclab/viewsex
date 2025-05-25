# viewsex
Spring Boot Boot with Views

Views- Views in SQL are a type of virtual table that simplifies fetch data from one or more tables.

Benefits- Simplify Complex Queries: Encapsulate complex joins and conditions into a single object. Enhance Security: Restrict access to specific columns or rows.

Example- CREATE TABLE employee ( id SERIAL PRIMARY KEY, name VARCHAR(100) );

CREATE TABLE address ( id SERIAL PRIMARY KEY, city VARCHAR(100), employee_id INT REFERENCES employee(id) );

CREATE VIEW employee_address_view AS SELECT e.id AS employee_id, e.name, a.city FROM employee e JOIN address a ON e.id = a.employee_id;
