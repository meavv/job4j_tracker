create table if not exists items (
                                     id serial primary key,
                                     name varchar(2000),
                                     created timestamp
);
create table if not exists cars (
                                    id serial primary key,
                                    model varchar(255),
                                    created timestamp
);