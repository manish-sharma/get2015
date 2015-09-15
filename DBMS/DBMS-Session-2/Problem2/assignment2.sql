-- select DATABASE 
 USE lib_info_sys;
 -- informations of all issued books
 SELECT bi.issue_dt "ISSUE DATE" , bi.accession_no "ACCESSION NO" , bi.member_id "MEMBER ID ", br.return_dt "RETUEN DATE"
 FROM book_issue bi LEFT JOIN book_return br ON bi.accession_no = br.accession_no
 JOIN members m ON bi.member_id = m.member_id
 ORDER BY bi.issue_dt , m.member_nm;
