drop table if exists employee_table;

crate table employee_name(
		employee_id integer not null auto_increment,
		email varchar(255),
		employee_name varchar(255),
		salary double precision,
		primary key(employee_id)
);