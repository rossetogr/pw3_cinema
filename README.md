# pw3-ingresso

# Guilherme Rosseto e Isadora Neves



CREATE DATABASE pw3_ingressos;

USE pw3_ingressos;

CREATE TABLE TBL_FILME (
ID_FILME BIGINT PRIMARY KEY IDENTITY,
TX_NOME VARCHAR(50) NOT NULL,
NR_DURACAO INT NOT NULL,
TP_CATEGORIA VARCHAR(17) NOT NULL,
TP_CLASSIFICACAO VARCHAR(5),
CHK_EM_CARTAZ VARCHAR(1),
NR_ANO INT,
TX_CAPA VARCHAR(300),
TX_DIRETOR VARCHAR(300),
TX_ELENCO VARCHAR(300),
TX_DESCRICAO VARCHAR(500),
NR_AVALIACAO FLOAT
);

CREATE TABLE TBL_SESSAO (
ID_SESSAO BIGINT PRIMARY KEY IDENTITY,
DT_DATA DATE NOT NULL,
LT_HORARIO TIME NOT NULL,
NR_PRECO FLOAT NOT NULL,
TX_SALA VARCHAR(20) NOT NULL,
ID_FILME BIGINT NOT NULL,
CONSTRAINT FK_SESSAO_FILME
FOREIGN KEY (ID_FILME)
REFERENCES TBL_FILME(ID_FILME)
);

INSERT INTO TBL_FILME
(TX_NOME, NR_DURACAO, TP_CATEGORIA, TP_CLASSIFICACAO, CHK_EM_CARTAZ, NR_ANO, TX_CAPA, TX_DIRETOR, TX_ELENCO, TX_DESCRICAO, NR_AVALIACAO)
VALUES
('Mad Max: Estrada da Fúria', 120, 'ACAO', 'A16', 'S', 2015, 'madmax.jpg', 'George Miller', 'Tom Hardy, Charlize Theron', 'Em um mundo pós-apocalíptico, uma fuga cheia de ação.', 8.6),

('Clube da Luta', 139, 'DRAMA', 'A18', 'N', 1999, 'clubedaluta.jpg', 'David Fincher', 'Brad Pitt, Edward Norton', 'Um homem cria um clube secreto com regras violentas.', 9.0),

('Homem-Aranha: Sem Volta Para Casa', 148, 'ACAO', 'A12', 'S', 2021, 'spiderman.jpg', 'Jon Watts', 'Tom Holland, Zendaya', 'Peter Parker enfrenta consequências de ter sua identidade revelada.', 8.7),

('O Iluminado', 146, 'TERROR', 'A16', 'N', 1980, 'iluminado.jpg', 'Stanley Kubrick', 'Jack Nicholson, Shelley Duvall', 'Um homem enlouquece isolado em um hotel.', 8.9),

('Divertida Mente', 95, 'ANIMACAO', 'LIVRE', 'S', 2015, 'divertidamente.jpg', 'Pete Docter', 'Amy Poehler, Bill Hader', 'As emoções de uma garota ganham vida dentro de sua mente.', 8.5);


INSERT INTO TBL_SESSAO (DT_DATA, LT_HORARIO, NR_PRECO, TX_SALA, ID_FILME)
VALUES ('2026-06-20', '14:30:00', 25.00, 'Sala 01 IMAX', 1),
('2026-06-20', '19:00:00', 30.00, 'Sala 01 IMAX', 1);

INSERT INTO TBL_SESSAO (DT_DATA, LT_HORARIO, NR_PRECO, TX_SALA, ID_FILME)
VALUES ('2026-06-21', '22:00:00', 20.00, 'Sala 03 VIP', 2);

INSERT INTO TBL_SESSAO (DT_DATA, LT_HORARIO, NR_PRECO, TX_SALA, ID_FILME)
VALUES ('2026-06-20', '15:00:00', 22.50, 'Sala 02', 3),
('2026-06-21', '18:15:00', 25.00, 'Sala 02', 3);

INSERT INTO TBL_SESSAO (DT_DATA, LT_HORARIO, NR_PRECO, TX_SALA, ID_FILME)
VALUES ('2026-06-23', '23:30:00', 18.00, 'Sala 05', 4);

INSERT INTO TBL_SESSAO (DT_DATA, LT_HORARIO, NR_PRECO, TX_SALA, ID_FILME)
VALUES ('2026-06-20', '13:00:00', 15.00, 'Sala 04 3D', 5),
('2026-06-21', '16:00:00', 17.50, 'Sala 04 3D', 5);

