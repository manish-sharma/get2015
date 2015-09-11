-- Display Name of member whose name is largest in character
SELECT member_nm , length(member_nm)
FROM members 
WHERE length( member_nm ) = (SELECT MAX(length(member_nm)) FROM members);