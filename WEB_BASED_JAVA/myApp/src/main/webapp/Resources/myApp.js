function Validiation()
{
	if(document.regForm.txtUsername.value=="")
	{
		alert("Username Required");
		return false;
	}
	if(document.regForm.txtPassword.value=="")
	{
		alert("Password Required");
		return false;
	}
	if(document.regForm.txtEmail.value=="")
	{
		alert("Email Required");
		return false;
	}
	if((document.regForm.gender[0].checked== false)&&(document.regForm.gender[1].checked== false))
	{
		alert("Please Seleect Gender");
		return false;
	}
	if(document.regForm.age.selectedIndex==0)
	{
		alert("Please Select Age Group");
		return false;
	}
	if(document.regForm.terms.checked==false)
	{
		alter("Agree Terms and Conditionss!!")
		return false;
	}
	
}