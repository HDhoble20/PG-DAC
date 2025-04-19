

function checkAll(){
    //let uname= document.getElementById("fname").ariaValueMax;
    let uname=document.myform.fname.value;
    let uedu=document.myform.edu;
    if(uname.trim()==="")
    {
        window.alert("full name is required");
        document.getElementById("fname").focus();
        return false;
    }
    if(!uname.trim().match("^[a-zA-Z ]{3,25}$"))
    {
        window.alert("fname must contain only charcater min 3 and max 25");
        document.getElementById("fname").focus();
        return false;
        
    }

    if(uedu[0].checked==false && uedu[1].checked==false && uedu[2].checked==false && uedu[3].checked==false)
    {
        window.alert("please select your qualification");
        return false;
    }
}
