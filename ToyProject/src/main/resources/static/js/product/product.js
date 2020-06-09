function btnClick(){
    alert("클릭 이벤트");
}



function main(){
    $('.activating.element').popup();
    
    $('.menu .browse')
    .popup({
        inline     : true,
        hoverable  : true,
        position   : 'bottom left',
        delay: {
        show: 300,
        hide: 800
        }
    });
}



document.addEventListener("DOMContentLoaded", main);