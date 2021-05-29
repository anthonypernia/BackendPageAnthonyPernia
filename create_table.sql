-- Table: public.blogs

-- DROP TABLE public.blogs;






CREATE TABLE blogs
(
    "id" SERIAL,
    "title" VARCHAR(150)  NOT NULL,
    "body" VARCHAR(3000)  NOT NULL,
    "author" VARCHAR(50) NOT NULL,
    PRIMARY KEY ("id")
);


insert into blogs (title, body, author)values('title cualquiera2222', 'body cualquiera2222', 'autor cualq2222')