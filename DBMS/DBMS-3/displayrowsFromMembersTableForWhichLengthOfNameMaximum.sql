-- Query to use library 
USE Library;
-- Query to display those rows of members table for which length of member name is maximum
Select DISTINCT memberName,LENGTH(memberName) AS lengthOfMemberName FROM Members WHERE LENGTH(memberName)=(SELECT max(LENGTH(memberName)) FROM Members);