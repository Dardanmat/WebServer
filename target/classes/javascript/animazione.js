var larghezza = window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth; 

var x = 0; 
var velocita = 2;
var img = document.getElementById('anim');
var b = false;

var intervalId = window.setInterval(function(){

    document.getElementById("anim").style.left = x + "px";
    
    if(x + 90> larghezza){
        velocita = -velocita;
    }
    
    if(x < 0){
        velocita = -velocita;
    }
    
    x += velocita;

}, 10);