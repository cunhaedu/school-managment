
-- INSER GENDER DATA

IF NOT EXISTS (select 1 from gender where name = 'Masculino')
    INSERT INTO gender (name) VALUES ('Masculino')
IF NOT EXISTS (select 1 from gender where name = 'Feminino')
    INSERT INTO gender (name) VALUES ('Feminino')

-- INSERT FEDERATIVE UNIT DATA

IF NOT EXISTS (select 1 from federative_unit where acronym = 'AC')
    INSERT INTO federative_unit (name, acronym) VALUES ('Acre', 'AC')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'AL')
    INSERT INTO federative_unit (name, acronym) VALUES ('Alagoas', 'AL')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'AM')
    INSERT INTO federative_unit (name, acronym) VALUES ('Amazonas', 'AM')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'BA')
    INSERT INTO federative_unit (name, acronym) VALUES ('Bahia', 'BA')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'CE')
    INSERT INTO federative_unit (name, acronym) VALUES ('Ceará', 'CE')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'DF')
    INSERT INTO federative_unit (name, acronym) VALUES ('Distrito Federal', 'DF')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'ES')
    INSERT INTO federative_unit (name, acronym) VALUES ('Espírito Santo', 'ES')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'GO')
    INSERT INTO federative_unit (name, acronym) VALUES ('Goiás', 'GO')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'MA')
    INSERT INTO federative_unit (name, acronym) VALUES ('Maranhão', 'MA')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'MT')
    INSERT INTO federative_unit (name, acronym) VALUES ('Mato Grosso', 'MT')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'MS')
    INSERT INTO federative_unit (name, acronym) VALUES ('Mato Grosso do Sul', 'MS')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'MG')
    INSERT INTO federative_unit (name, acronym) VALUES ('Minas Gerais', 'MG')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'PA')
    INSERT INTO federative_unit (name, acronym) VALUES ('Pará', 'PA')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'PB')
    INSERT INTO federative_unit (name, acronym) VALUES ('Paraíba', 'PB')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'PR')
    INSERT INTO federative_unit (name, acronym) VALUES ('Paraná', 'PR')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'PE')
    INSERT INTO federative_unit (name, acronym) VALUES ('Pernambuco', 'PE')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'PI')
    INSERT INTO federative_unit (name, acronym) VALUES ('Piauí', 'PI')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'RJ')
    INSERT INTO federative_unit (name, acronym) VALUES ('Rio de Janeiro', 'RJ')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'RN')
    INSERT INTO federative_unit (name, acronym) VALUES ('Rio Grande do Norte', 'RN')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'RS')
    INSERT INTO federative_unit (name, acronym) VALUES ('Rio Grande do Sul', 'RS')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'RO')
    INSERT INTO federative_unit (name, acronym) VALUES ('Rondônia', 'RO')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'RR')
    INSERT INTO federative_unit (name, acronym) VALUES ('Roraima', 'RR')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'SC')
    INSERT INTO federative_unit (name, acronym) VALUES ('Santa Catarina', 'SC')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'SP')
    INSERT INTO federative_unit (name, acronym) VALUES ('São Paulo', 'SP')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'SE')
    INSERT INTO federative_unit (name, acronym) VALUES ('Sergipe', 'SE')
GO
IF NOT EXISTS (select 1 from federative_unit where acronym = 'TO')
    INSERT INTO federative_unit (name, acronym) VALUES ('Tocantins', 'TO')
GO
