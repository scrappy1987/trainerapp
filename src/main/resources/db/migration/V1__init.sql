create table TRAINER
(
	id integer not null,
	firstname varchar (255),
	secondname varchar (255),
	position varchar (255),
	primary key(id)
);

create table RATING
(
	id integer not null,
	rating integer,
	yearsexperience integer,
	primary key(id)
);

create table SUBJECT
(
	id integer not null,
	subjectname varchar (255),
	trainer_id integer, 
	rating_id integer, 
	foreign key(trainer_id) references TRAINER(id),
	foreign key(rating_id) references RATING(id)
);

INSERT INTO TRAINER (id, firstname, secondname, position) VALUES (1, 'John', 'Gordon', 'trainer manager');
INSERT INTO RATING (id, rating, yearsexperience) VALUES (1, 5, 5);
INSERT INTO SUBJECT (id, subjectname, trainer_id, rating_id) VALUES (1, 'Java EE', 1, 1);

INSERT INTO TRAINER (id, firstname, secondname, position) VALUES (2, 'Jim', 'Grindrod', 'trainer');
INSERT INTO RATING (id, rating, yearsexperience) VALUES (2, 1, 3);
INSERT INTO SUBJECT (id, subjectname, trainer_id, rating_id) VALUES (2, 'Java EE', 2, 2);
