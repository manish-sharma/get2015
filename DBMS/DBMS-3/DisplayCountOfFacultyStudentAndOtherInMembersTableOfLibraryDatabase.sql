-- Query to use library database
USE Library;
-- Query to display total count of students,faculty,others
SELECT (SELECT COUNT(memberName) FROM Members WHERE category='Student') AS Students_Count,
        (SELECT COUNT(memberName) FROM Members WHERE category='Faculty') AS Faculty_Count,
        (SELECT COUNT(memberName) FROM Members WHERE category='Other') AS Other_Count;
    
    

