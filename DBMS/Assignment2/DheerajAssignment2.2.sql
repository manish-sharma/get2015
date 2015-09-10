
/*Select to display information of all books issued show(issue date, accssion no, member id and return date)*/

SELECT bi.issue_date "Book Issued Date", bi.accession_no "Accession Number", 
bi.member_id "Book Issued To", return_date "Returned Date" , m.member_name "Member Name"
FROM book_issue AS bi JOIN book_return AS br ON bi.accession_no = br.accession_no 
JOIN members AS m ON m.member_id = bi.member_id  ORDER BY bi.issue_date , bi.member_id;
