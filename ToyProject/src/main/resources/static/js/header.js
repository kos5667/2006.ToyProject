function btnClick(){
    alert("클릭 이벤트");
}

function selectHeaderCategoryList(){
    const listElement = document.querySelector('.grid');
 
    $.ajax({
        data: {
            categoryNo: 0
        },
        url: "/category/list",
        type: 'GET',
        dataType : "json",
        success: function(list) {
            for(let i=0; i<list.length;i++){
                let data=list[i]; 
                const itemElement = document.createElement('div');
                itemElement.classList.value = 'column';
                itemElement.innerHTML = `<h4 class="ui header">
                <a href="/product/list?categoryNo=${data.category_no}">${data.name}</h4>`

               
                listElement.append(itemElement);
            }
            

        }, error: function() {
            alert('에러임');
        }
}); //ajax end
}

function headerMain(){
    console.log("heade.로그");

    $('.activating.element').popup();
    
    $('.menu .browse')
    .popup({
        inline     : true,
        hoverable  : true,
        position   : 'bottom left',
        lastResort : 'bottom left',
        delay: {
        show: 300,
        hide: 300
        }
    });
    selectHeaderCategoryList();
}



document.addEventListener("DOMContentLoaded", headerMain);