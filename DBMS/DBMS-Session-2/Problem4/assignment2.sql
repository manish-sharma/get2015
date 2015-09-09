 USE lib_info_sys;
 SELECT issue_dt , accession_no , temp_table.member_id , return_dt
 FROM members ,
               ( SELECT bi.issue_dt , bi.accession_no , bi.member_id , br.return_dt 
                 FROM book_issue bi LEFT JOIN book_return br
                 ON bi.accession_no = br.accession_no
               ) 
               AS temp_table
 WHERE members.member_id = temp_table.member_id              
 ORDER BY issue_dt , member.member_nm;
 

