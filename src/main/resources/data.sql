DROP TABLE IF EXISTS task;

CREATE TABLE task(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL
);

INSERT INTO task(name, description) VALUES
    ('name1','Primeira tarefa'),
    ('name2','Segunda tarefa'),
    ('name3','Terceira tarefa');



--    DROP TABLE IF EXISTS task;
--
--    CREATE TABLE task(
--        id INT AUTO_INCREMENT PRIMARY KEY,
--        name VARCHAR(250) NOT NULL,
--        description VARCHAR(250) NOT NULL
--    );
--
--    INSERT INTO task(id, name, description) VALUES
--        (1,'name1','Primeira tarefa'),
--        (2,'name2','Segunda tarefa'),
--        (3,'name3','Terceira tarefa');
