# --- First database schema

# --- !Ups

create table plato (
  id                        bigint not null,
  name                      varchar(255),
  origen					varchar(255),
  valor						varchar(255),
  demora					varchar(255),
  constraint pk_plato primary key (id))
;

create sequence plato_seq start with 1000;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists plato;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists plato_seq;
