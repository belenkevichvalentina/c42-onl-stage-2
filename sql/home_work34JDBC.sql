create table homework_32.profiles
(
    id    BIGSERIAL
        constraint profiles_pk
            primary key,
    email varchar not null
        constraint profiles_email_key
            unique

);
CREATE TABLE homework_32.users_dz34
(
    id         BIGSERIAL
        CONSTRAINT users_dz34_pk
            PRIMARY KEY,
    name       VARCHAR NOT NULL,
    username   VARCHAR NOT NULL
        CONSTRAINT users_dz34_username_key
            UNIQUE,
    password   VARCHAR NOT NULL,
    profile_id BIGINT
        CONSTRAINT users_dz34_profile_id_key
            UNIQUE
        CONSTRAINT fk_user_profile
            REFERENCES homework_32.profiles (id)
            ON DELETE CASCADE
);

-- users_dz34 1 - 1 profiles

create table homework_32.orders
(
    id         BIGSERIAL
        constraint orders_pk
            primary key,
    order_date TIMESTAMP default CURRENT_TIMESTAMP,
    user_id    BIGINT not null
        constraint fk_order_user
            references homework_32.users_dz34
            on delete cascade
);
--  1:M между пользователями (users_dz34) и заказами (orders)

create table homework_32.roles
(
    id        BIGSERIAL
        constraint roles_pk
            primary key,
    role_name varchar not null
        constraint roles_role_name_key
            unique
);

create table homework_32.user_roles
(
    user_id BIGINT
        constraint fk_bridge_user
            references homework_32.users_dz34
            on delete cascade,
    role_id BIGINT
        constraint fk_bridge_role
            references homework_32.roles
            on delete cascade,
    constraint user_roles_pk
        primary key (user_id, role_id)
);
-- M:M (user_id:1 - role_id:1) (user_id:2 - role_id:1) (user_id:2 - role_id:2)
-- profiles
INSERT INTO homework_32.profiles (email) VALUES ('ivan@mail.ru'), ('elena@mail.ru'), ('admin@company.com');
-- users_dz34
INSERT INTO homework_32.users_dz34 (name, username, password, profile_id) VALUES ('Иван', 'ivan_cool', 'pass123', 1),
 ('Елена', 'elena_pro', 'qwerty', 2), ('Алексей', 'super_admin', 'admin777', 3);

--  1:M
INSERT INTO homework_32.orders (user_id) VALUES (1), (1), (2);

--   roles
INSERT INTO homework_32.roles (role_name) VALUES  ('USER'), ('MANAGER'), ('ADMIN');

INSERT INTO  homework_32.user_roles (user_id, role_id) VALUES (1, 1), (2, 1), (2, 2), (3, 3);

SELECT
    u.name AS имя_пользователя,
    p.email AS электронная_почта,
    r.role_name AS роль,
    o.id AS номер_заказа,
    o.order_date AS дата_заказа
FROM homework_32.users_dz34 u
         JOIN homework_32.profiles p ON u.profile_id = p.id
         LEFT JOIN homework_32.user_roles ur ON u.id = ur.user_id
         LEFT JOIN homework_32.roles r ON ur.role_id = r.id
         LEFT JOIN homework_32.orders o ON u.id = o.user_id;