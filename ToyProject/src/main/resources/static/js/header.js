function btnClick(){
    alert("클릭 이벤트");
}

function getCategoryList(){
    const listElement = document.querySelector('.grid');

    $.ajax({
        // data: {
        //     USER_ID: id,
        //     PASSWORD: pw
        //         },
        url: "/category/header",
        type: 'GET',
        dataType : "json",
        success: function(list) {
            for(let i=0; i<list.length;i++){
                let data=list[i]; 
                const itemElement = document.createElement('div');
                itemElement.classList.value = 'column';
                itemElement.innerHTML = `<h4 class="ui header">
                <a href="/product/list?category_no=${data.category_no}">${data.name}</h4>`

               
                listElement.append(itemElement);
            }
            

        }, error: function() {
            alert('에러임');
        }
}); //ajax end
}

function main(){
    console.log("테스트");

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

    getCategoryList();
}



document.addEventListener("DOMContentLoaded", main);