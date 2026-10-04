create table homework_32.employees
(
    employee_id integer,
    first_name varchar(20),
    last_name varchar(25) not null,
    email varchar(25) not null
        constraint emp_email_uk
            unique,
    phone_number varchar(20),
    hire_date date not null,
    salary numeric(8, 2)
        constraint emp_salary_min
            check (salary > (0)::numeric),
    commission_pct numeric(2, 2),
    department_id integer
);

select * from homework_32.employees;
commit;
INSERT INTO homework_32.employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, commission_pct, department_id)
VALUES
    (1, 'Steven', 'King', 'steve.king@mail.com', '515.123.4567', '1987-06-17', 24000, NULL, 90),
    (2, 'Neena', 'Kochhar', 'neen.kochhar@mail.com', '515.123.4568', '1989-09-21', 17000, NULL, 90),
    (3, 'Lex', 'De Haan', 'lex.dehan@mail.com', '515.123.4569', '1993-01-13', 17000, NULL, 90),
    (4, 'Alexander', 'Hunold', 'alexande.hunold@mail.com', '515.423.4567', '1990-01-03', 9000, NULL, 60),
    (5, 'Bruce', 'Ernst', 'bruc.ernst@mail.com', '590.423.4568', '1991-05-21', 6000, NULL, 60),
    (6, 'David', 'Austin', 'david.austn@mail.com', '590.423.4569', '1997-06-25', 4800, NULL, 60),
    (7, 'Valli', 'Pataballa', 'vali.patabala@mail.com', '590.423.4560', '1998-02-05', 4800, NULL, 60),
    (8, 'Diana', 'Lorentz', 'diana.lorent@mail.com', '590.423.5567', '1999-02-07', 4200, NULL, 60),
    (9, 'Nancy', 'Greenberg', 'nancy.greenbeg@mail.com', '515.124.4569', '1994-08-17', 12000, NULL, 100),
    (10, 'Daniel', 'Faviet', 'daniel.favit@mail.com', '515.124.4169', '1994-08-16', 9000, NULL, 100),
    (11, 'John', 'Chen', 'john.che@mail.com', '515.124.4269', '1997-09-28', 8200, NULL, 100),
    (12, 'Ismael', 'Sciarra', 'ismael.sciara@mail.com', '515.124.4369', '1997-09-30', 7700, NULL, 100),
    (13, 'Jose Manuel', 'Urman', 'jose.ura@mail.com', '515.124.4469', '1998-03-07', 7800, NULL, 100),
    (14, 'Luis', 'Popp', 'luis.pop@mail.com', '515.124.4567', '1999-12-07', 6900, NULL, 100),
    (15, 'Den', 'Raphaely', 'den.raphaey@mail.com', '515.127.4561', '1994-12-07', 11000, NULL, 30),
    (16, 'Alexander', 'Khoo', 'alexander.kho@mail.com', '515.127.4562', '1995-05-18', 3100, NULL, 30),
    (17, 'Shelli', 'Baida', 'shelli.baid@mail.com', '515.127.4563', '1997-12-24', 2900, NULL, 30),
    (18, 'Sigal', 'Tobias', 'sigal.tobis@mail.com', '515.127.4564', '1997-07-24', 2800, NULL, 30),
    (19, 'Guy', 'Himuro', 'guy.himur@mail.com', '515.127.4565', '1998-11-15', 2600, NULL, 30),
    (20, 'Karen', 'Colmenares', 'karen.colmen@mail.com', '515.127.4566', '1999-08-10', 2500, NULL, 30),
    (21, 'Matthew', 'Weiss', 'matthew.weis@mail.com', '650.123.1234', '1996-07-18', 8000, NULL, 50),
    (22, 'Adam', 'Fripp', 'adam.frip@mail.com', '650.123.2234', '1997-04-10', 8200, NULL, 50),
    (23, 'Payam', 'Kaufling', 'payam.kauflin@mail.com', '650.123.3234', '1995-05-01', 7900, NULL, 50),
    (24, 'Shanta', 'Vollman', 'shanta.volman@mail.com', '650.123.4234', '1997-10-10', 6500, NULL, 50),
    (25, 'Kevin', 'Mourgos', 'kevin.mourgos@mail.com', '650.123.5234', '1999-11-16', 5800, NULL, 50),
    (26, 'Julia', 'Nayer', 'julia.nayer@mail.com', '650.124.1214', '1997-07-16', 3200, NULL, 50),
    (27, 'Irene', 'Mikkilineni', 'irene.mikili@mail.com', '650.124.1224', '1998-09-28', 2700, NULL, 50),
    (28, 'James', 'Landry', 'jams.landry@mail.com', '650.124.1334', '1999-01-14', 2400, NULL, 50),
    (29, 'Steven', 'Markle', 'steven.marke@mail.com', '650.124.1434', '2000-03-08', 2200, NULL, 50),
    (30, 'Laura', 'Bissot', 'laura.bisst@mail.com', '650.124.5234', '1997-08-20', 3300, NULL, 50),
    (31, 'Mozhe', 'Atkinson', 'mozhe.atkin@mail.com', '650.124.6234', '1997-10-30', 2800, NULL, 50),
    (32, 'James', 'Marlow', 'james.marlw@mail.com', '650.124.7234', '1997-02-16', 2500, NULL, 50),
    (33, 'TJ', 'Olson', 'tj.olson@mail.com', '650.124.8234', '1999-04-10', 2100, NULL, 50),
    (34, 'Jason', 'Mallin', 'jason.malin@mail.com', '650.127.1934', '1996-06-14', 3300, NULL, 50),
    (35, 'Michael', 'Rogers', 'michl.rogers@mail.com', '650.127.1834', '1998-08-26', 2900, NULL, 50),
    (36, 'Ki', 'Gee', 'ki.gee@mail.com', '650.127.1734', '1999-12-12', 2400, NULL, 50),
    (37, 'Hazel', 'Philtanker', 'hazel.philtan@mail.com', '650.127.1634', '2000-02-06', 2200, NULL, 50),
    (38, 'Renske', 'Ladwig', 'rensk.ladwig@mail.com', '650.121.1234', '1995-07-14', 3600, NULL, 50),
    (39, 'Stephen', 'Stiles', 'step.stiles@mail.com', '650.121.2034', '1997-10-26', 3200, NULL, 50),
    (40, 'John', 'Seo', 'john.seo@mail.com', '650.121.2019', '1998-02-12', 2700, NULL, 50),
    (41, 'Joshua', 'Patel', 'joshua.patel@mail.com', '650.121.1834', '1998-04-06', 2500, NULL, 50),
    (42, 'Peter', 'Vargas', 'peter.vargas@mail.com', '650.121.2004', '1998-07-09', 2500, NULL, 50),
    (43, 'Randall', 'Matos', 'randal.matos@mail.com', '650.121.2874', '1998-03-15', 2600, NULL, 50),
    (44, 'Ellen', 'Abel', 'elen.abel@mail.com', '011.44.1644.429267', '1996-05-11', 11000, 0.30, 80),
    (45, 'Sundar', 'Ande', 'sundar.ande@mail.com', '011.44.1644.429266', '1997-03-24', 6400, 0.10, 80),
    (46, 'Amit', 'Banda', 'amit.band@mail.com', '011.44.1644.429265', '1998-04-21', 6200, 0.10, 80),
    (47, 'Elizabeth', 'Bates', 'elizabe.bates@mail.com', '011.44.1644.429264', '1999-03-24', 7300, 0.15, 80),
    (48, 'William', 'Smith', 'william.smith@mail.com', '011.44.1644.429263', '2000-06-23', 7400, 0.15, 80),
    (49, 'Tayler', 'Fox', 'tayler.fox@mail.com', '011.44.1644.429262', '2001-01-24', 9600, 0.20, 80),
    (50, 'Sarah', 'Bell', 'sarah.bell@mail.com', '011.44.1344.429268', '1996-02-04', 8000, 0.25, 80);
commit;
select * from homework_32.employees;

select * from homework_32.employees;

SELECT * FROM homework_32.employees WHERE department_id = 50 AND salary > 4000;

SELECT * FROM homework_32.employees WHERE first_name LIKE '%a';

SELECT * FROM homework_32.employees WHERE department_id IN (50, 80) AND commission_pct IS NOT NULL;

SELECT * FROM homework_32.employees WHERE salary BETWEEN 8000 AND 9000;

SELECT employee_id, first_name, last_name,  replace(phone_number, '.', '-') AS formatted_phone FROM homework_32.employees;

SELECT department_id, salary, COUNT(*) FROM homework_32.employees GROUP BY department_id, salary HAVING COUNT(*) > 1;
SELECT * FROM homework_32.employees WHERE LENGTH(first_name) = (SELECT MAX(LENGTH(first_name)) FROM homework_32.employees);
commit;