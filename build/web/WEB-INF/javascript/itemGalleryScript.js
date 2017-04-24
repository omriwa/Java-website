/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(
        function(){
            $(".btn-info").click(function(){
                var picDiv = $(this).parent().parent().children(".item-image");
                var info = $(this).parent().parent().children(".item-info");
                var btn = $(this);
                
                if(info.css("display") === "none"){
                    picDiv.slideToggle(1000 , function(){
                        info.slideToggle(1000);
                        btn.toggleClass("btn-info");
                        btn.toggleClass("btn-success");
                        btn.text("Close Info");
                    });
                }
                else{
                   info.slideToggle(1000 , function(){
                       picDiv.slideToggle(1000);
                       btn.toggleClass("btn-info");
                       btn.toggleClass("btn-success");
                       btn.text("Info");
                   }); 
                }
                
            });  
        }
    );

