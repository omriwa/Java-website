/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function sendRegForm(){
    sendForm(isValid());
}

function isValid(){
    var username = $("[name='username']").val();
    var password = $("[name='password']").val();

    //password validition
    var bigLetter = false , smallLetter = false , length = false;
    var message = "";

    if(password.length >= 8)//checking length of pass
        length = true;

    for(var i = 0 ; i < password.length ; i++){
        if(password.charAt(i) <= 'Z' && password.charAt(i) >= 'A')//checking big letter
            bigLetter = true;
        if(password.charAt(i) <= 'z' && password.charAt(i) >= 'a')//checking small letter
            smallLetter = true;
    }
    //setup user message
    if(!bigLetter)
        message += "* big letter\n";
    if(!smallLetter)
        message += "* small letter\n";
    if(!length)
        message += "* 8 digits\n";
    
    var userMessage = $(".usermessage");
    if(message.length > 0){
        userMessage.css("display" , "block");
        userMessage.text(message);
    }
    else{
        userMessage.css("display" , "none");
    }
    
    if(message)
        return false;
    else
        return true;
}

function sendForm(valid){
    if(valid){
        var username = $("[name='username']").val();
        var password = $("[name='password']").val();
        $.post("/register" , {username : username , password : password} , function(data ,status){
            if(data === "exists"){
                $("[name='username']").val("");
                $("[name='password']").val("");
            }
            else{
                window.location.replace("http://localhost:8080/login");
            }
                
        });
    }       
}   


