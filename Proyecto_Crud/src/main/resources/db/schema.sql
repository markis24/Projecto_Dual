CREATE TABLE IF NOT EXISTS libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    editorial VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    tematica VARCHAR(50) NOT NULL
);


CREATE TABLE IF NOT EXISTS usuarios (
    id int PRIMARY KEY AUTO_INCREMENT,
    usuario varchar(30) NOT NULL UNIQUE,
    password varchar(30) NOT NULL
);
