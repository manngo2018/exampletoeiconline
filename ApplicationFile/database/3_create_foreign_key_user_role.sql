alter table user add constraint fk_user_role foreign key (roleid) references role(roleid);

