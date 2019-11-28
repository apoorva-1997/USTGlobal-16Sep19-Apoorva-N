function name(){
    var name = document.getElementById("name")
}
function mypwd(){
    var temp = document.getElementById("pass")
    if(temp.type === "password"){
        temp.type = "text";
    }
    else{
        temp.text = "passsword";
    }
}