SELECT BI.issue_date, BI.accession_no, BI.member_id, IFNULL(BR.return_date, "") AS return_date
FROM book_issue BI
LEFT JOIN book_return BR
ON BI.accession_no = BR.accession_no AND BI.member_id = BR.member_id
ORDER BY BI.issue_date;