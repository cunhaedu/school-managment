IF DB_ID('Student') IS NULL
    CREATE DATABASE Student

USE Student

IF OBJECT_ID('gender') IS NULL
    CREATE TABLE gender (
        id      INT             IDENTITY(1, 1),
        name    VARCHAR(10)     NOT NULL,

        CONSTRAINT gender_pk        PRIMARY KEY (id),
        CONSTRAINT gener_name_uk    UNIQUE (name)
    )

IF OBJECT_ID('federative_unit') IS NULL
    CREATE TABLE federative_unit (
        id      INT             IDENTITY(1, 1),
        name    VARCHAR(20)     NOT NULL,
        acronym VARCHAR(2)      NOT NULL,

        CONSTRAINT federative_unit_pk PRIMARY KEY (id),
        CONSTRAINT federative_unit_acronym_uk UNIQUE (acronym)
    )

IF OBJECT_ID('person') IS NULL
    CREATE TABLE person (
        id              INT             IDENTITY(1, 1),
        name            VARCHAR(100)    NOT NULL,
        cpf             VARCHAR(15)     NOT NULL,
        photo_url       VARCHAR(MAX)    NULL,
        birthdate       DATE            NOT NULL,
        gender_id       INT             NOT NULL,
        address         VARCHAR(300)    NOT NULL,
        uf              VARCHAR(2)      NOT NULL,
        city            VARCHAR(100)    NOT NULL,
        personal_email  VARCHAR(200)    NOT NULL,
        cell_phone      VARCHAR(14)     NOT NULL,

        CONSTRAINT person_pk PRIMARY KEY (id),
        CONSTRAINT person_cpf_uk    UNIQUE (cpf),
        CONSTRAINT person_email_uk    UNIQUE (email),
        CONSTRAINT person_gender_fk FOREIGN KEY (gender_id) REFERENCES gender (id)
    )

IF OBJECT_ID('user') IS NULL
    CREATE TABLE users (
        id              INT             IDENTITY(1, 1),
        person_id       INT             NOT NULL,
        email           VARCHAR(200)    NOT NULL,
        password        VARCHAR(15)     NOT NULL,

        CONSTRAINT user_pk PRIMARY KEY (id),
        CONSTRAINT user_email_uk    UNIQUE (email),
        CONSTRAINT user_person_fk   FOREIGN KEY (person_id) REFERENCES person (id),
    )


-- IF OBJECT_ID('school') IS NULL
--     CREATE TABLE school (
--         id          INT             IDENTITY(1, 1),
--         name        VARCHAR(150)    NOT NULL,
--         about       VARCHAR(MAX)    NULL,
--         image_url   VARCHAR(MAX)    NULL,
--         address     VARCHAR(MAX)    NOT NULL,
--         uf_id       INT             NOT NULL,
--         city        VARCHAR(100)    NOT NULL,
--         email       VARCHAR(MAX)    NOT NULL,
--         cell_phone  VARCHAR(14)     NOT NULL,
--         active      BIT             NOT NULL CONSTRAINT school_active_df DEFAULT 1

--         CONSTRAINT school_pk PRIMARY KEY (id),
--         CONSTRAINT school_uf_fk FOREIGN KEY (uf_id) REFERENCES federative_unit (id)
--     )

-- IF OBJECT_ID('school_subject') IS NULL
--     CREATE TABLE school_subject (
--         id          INT             IDENTITY(1, 1),
--         name        VARCHAR(150)    NOT NULL,


--         CONSTRAINT school_subject_pk PRIMARY KEY (id),
--         CONSTRAINT school_subject_name_uk UNIQUE (name)
--     )

-- IF OBJECT_ID('school_professor') IS NULL
--     CREATE TABLE school_professor (
--         id                  INT     IDENTITY(1, 1),
--         person_id           INT     NOT NULL,
--         school_id           INT     NOT NULL,
--         start_working_at    DATE    NOT NULL,
--         stop_working_at     DATE    NULL,

--         CONSTRAINT school_professor_pk PRIMARY KEY (id),
--         CONSTRAINT school_professor_person_fk FOREIGN KEY (person_id) REFERENCES person (id),
--         CONSTRAINT school_professor_school_fk FOREIGN KEY (school_id) REFERENCES school (id)
--     )

-- IF OBJECT_ID('school_professor_subject') IS NULL
--     CREATE TABLE school_professor_subject (
--         id                  INT             IDENTITY(1, 1),
--         school_professor_id INT             NOT NULL,
--         subject_id          INT             NOT NULL,

--         CONSTRAINT sps_pk PRIMARY KEY (id),
--         CONSTRAINT sps_school_professor_fk FOREIGN KEY (school_professor_id) REFERENCES school_professor (id),
--         CONSTRAINT sps_subject_fk FOREIGN KEY (subject_id) REFERENCES school_subject (id)
--     )

-- IF OBJECT_ID('school_student') IS NULL
--     CREATE TABLE school_student (
--         id                  INT     IDENTITY(1, 1),
--         person_id           INT     NOT NULL,
--         school_id           INT     NOT NULL,
--         start_studing_at    DATE    NOT NULL,
--         stop_studing_at     DATE    NULL,

--         CONSTRAINT school_student_pk PRIMARY KEY (id),
--         CONSTRAINT school_student_person_fk FOREIGN KEY (person_id) REFERENCES person (id),
--         CONSTRAINT school_student_school_fk FOREIGN KEY (school_id) REFERENCES school (id)
--     )

-- IF OBJECT_ID('disciplinary_action') IS NULL
--     CREATE TABLE disciplinary_action (
--         id              INT     IDENTITY(1, 1),
--         [action]        VARCHAR(100)    NOT NULL,
--         [description]     VARCHAR(MAX)

--         CONSTRAINT disciplinary_action_pk PRIMARY KEY (id),
--         CONSTRAINT disciplinary_action_action_uk UNIQUE ([action])
--     )

-- IF OBJECT_ID('school_student_disciplinary_action') IS NULL
--     CREATE TABLE school_student (
--         id                  INT     IDENTITY(1, 1),
--         school_student_id           INT     NOT NULL,
--         incident_details    VARCHAR(MAX)    NOT NULL,
--         reported_by         INT,
--         incident_date       DATE    NOT NULL,

--         CONSTRAINT ssda_pk PRIMARY KEY (id),
--         CONSTRAINT ssda_school_student_id_fk FOREIGN KEY (school_student_id) REFERENCES school_student (id),
--         CONSTRAINT ssad_reporter_fk FOREIGN KEY (reported_by) REFERENCES school_professor (id)
--     )
