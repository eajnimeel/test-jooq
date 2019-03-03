create database test;
create schema test ;
create table test.test
(
  test_id serial not null,
  korean_word varchar(45) not null,
  english_full_word varchar(45) not null,
  english_short_word varchar(45),
  use_yn boolean,
  package_yn boolean,
  class_yn boolean,
  variable_yn boolean,
  method_yn boolean,
  view_yn boolean,
  reg_dttm timestamp not null,
  mod_dttm timestamp
);

comment on column test.dictionary.korean_word is '한국어 단어';

comment on column test.dictionary.english_full_word is '영문 단어';

comment on column test.dictionary.english_short_word is '영문 축약어';

comment on column test.dictionary.use_yn is '사용 여부';

comment on column test.dictionary.reg_dttm is '등록 일시';

comment on column test.dictionary.mod_dttm is '수정 일시';

create unique index test_test_id_uindex
  on test.dictionary (test_id);

alter table test.dictionary
  add constraint test_pk
    primary key (test_id);


