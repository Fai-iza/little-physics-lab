SELECT * FROM physics_lab.scores;

SELECT 
username,
lab_score,
qize_score,
sum(qize_score +lab_score) AS "tottal"
FROM scores;