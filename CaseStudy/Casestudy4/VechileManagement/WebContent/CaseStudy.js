function validationOfAdmin()
{ var flag=true;
  var name=document.getElementById("user_name").value;
  var password=document.getElementById("password").value;
   if(name!="nikhil")
   { flag=false;
     alert("user name is not valid");
	
   }
   else if(password!="1234")
   {
     flag=false;
     alert("password is not valid");
	
   
   }

return flag;

}
function CreateSuccess()
{
alert("Car is successfully created");
}
function goBack() {
    window.history.back();
}
function EditedSuccess()
{
alert("Car is successfully Edited");
}
