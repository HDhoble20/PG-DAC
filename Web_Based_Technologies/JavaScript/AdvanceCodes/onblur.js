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
