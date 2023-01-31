
create table hall (
    h_id int8 primary key not null,
    seats_num int not null
);

create table film (
    f_id int8 primary key not null,
    title varchar(255) not null,
    year int not null,
    age int not null,
    filename varchar(255),
    description varchar(2048)
);

create table film_session (
    s_id int8 primary key not null,
    h_id int8 not null,
    f_id int8 not null,
    price float8 not null,
    foreign key (h_id) references hall (h_id) ON DELETE CASCADE,
    foreign key (f_id) references film (f_id) ON DELETE CASCADE
);