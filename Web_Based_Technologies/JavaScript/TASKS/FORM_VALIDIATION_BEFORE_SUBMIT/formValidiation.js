function checkUID(){
    let userID=document.getElementById("uid").value;
    if(userID.trim()===""){
        // window.alert("User id is required");
        document.getElementById("uid").style.border="2px solid black";
        document.getElementById("uidErr").innerHTML="user id required";
        document.getElementById("uidErr").style.border="2px solid red";

        return false;
    }
    else if(!userID.match("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
    {
        document.getElementById("uid").style.border="2px solid black";
        document.getElementById("uidErr").innerHTML="user id must be same as email";
        document.getElementById("uidErr").style.border="2px solid red";

    }
    else{
        document.getElementById("uid").style.border="2px solid black";
        document.getElementById("uidErr").innerHTML="";
    }
}
function checkPass(){
    let pwd=document.getElementById("pass").value;
    if(pwd.trim()===""){
        // window.alert("Password is required");
        document.getElementById("pass").style.border="2px solid black";
        document.getElementById("passErr").innerHTML="PASSWORD IS MANDITORY";
        document.getElementById("passErr").style.border="2px solid red";

        return false;
    }
   
     else if(!pwd.match("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{3,}$"))
       {
        document.getElementById("pass").style.border="2px solid black";            
        document.getElementById("passErr").innerHTML="PASS MUST CONTAIN MIN 3 CHAR, 1 uCASE & lCASE, 1 DIGIT ,1 SPECIAL CHAR";
        document.getElementById("passErr").style.border="2px solid red";
       }
       else{
        document.getElementById("pass").style.border="2px solid black";
        document.getElementById("passErr").innerHTML="";
    }
    
}

