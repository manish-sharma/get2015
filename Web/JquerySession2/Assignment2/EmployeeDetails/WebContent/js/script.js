/**
 * 
 */
$(document).ready(init);

function init() {
	$('#employeeName').change(loadInfo);
}

function loadInfo() {
	var id = $("#employeeName").val();
	$.ajax({
	       type : "POST",
	       url : "EmployeeDetail",
	       data :  {id : id},
	       datatype : "html",
	       success : function(data) {
	           $("#demo").html(data);
	       }
	   });
	}
