
-- INSER GENDER DATA

IF NOT EXISTS (select 1 from gender where name = 'Masculino')
    INSERT INTO gender (name) VALUES ('Masculino')
IF NOT EXISTS (select 1 from gender where name = 'Feminino')
    INSERT INTO gender (name) VALUES ('Feminino')

-- Inserindo dados na tabela person
INSERT INTO person (name, cpf, photo_url, birthdate, gender_id, address, uf, city, personal_email, cell_phone)
VALUES 
('Carlos Silva', '123.456.789-01', NULL, '1990-05-15', 1, 'Rua das Flores, 123', 'SP', 'São Paulo', 'carlos.silva@email.com', '(11) 98765-4321'),
('Ana Souza', '987.654.321-00', NULL, '1985-10-22', 2, 'Av. Brasil, 456', 'RJ', 'Rio de Janeiro', 'ana.souza@email.com', '(21) 91234-5678'),
('João Pereira', '321.654.987-22', NULL, '1993-07-08', 1, 'Rua Central, 789', 'MG', 'Belo Horizonte', 'joao.pereira@email.com', '(31) 99876-5432'),
('Mariana Lima', '159.753.468-33', NULL, '1998-12-30', 2, 'Av. Paulista, 1010', 'SP', 'São Paulo', 'mariana.lima@email.com', '(11) 94567-8901'),
('Rafael Costa', '753.159.846-44', NULL, '1980-03-25', 1, 'Rua da Praia, 55', 'BA', 'Salvador', 'rafael.costa@email.com', '(71) 98765-4321');

-- Inserindo dados na tabela users
INSERT INTO users (person_id, email, password)
VALUES 
(1, 'carlos.silva@email.com', 'Senha123'),
(2, 'ana.souza@email.com', 'Senha456'),
(3, 'joao.pereira@email.com', 'Senha789'),
(4, 'mariana.lima@email.com', 'SenhaABC'),
(5, 'rafael.costa@email.com', 'SenhaXYZ');