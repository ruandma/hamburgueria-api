INSERT INTO users (username, password, role) VALUES 
('admin', '$2a$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi', 'ROLE_ADMIN')
ON CONFLICT DO NOTHING;

INSERT INTO produto (nome, preco, descricao, disponivel) VALUES
('X-Burguer Clássico', 25.90, 'Pão, carne 180g, queijo e salada', true),
('X-Bacon Duplo', 32.50, 'Pão, 2 carnes, bacon, cheddar', true),
('Batata Frita G', 18.00, 'Porção grande com cheddar e bacon', true)
ON CONFLICT DO NOTHING;