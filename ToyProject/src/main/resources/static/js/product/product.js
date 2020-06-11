function btnClick(){
    alert("클릭 이벤트");
}

function selectProductList(no){
    const listElement = document.querySelector('.cards');
    
    
    $.ajax({
        data: {
            category_no: no
        },
        url: "/product/list2",
        type: 'GET',
        dataType : "json",
        success: function(list) {
            $('.cards').empty();

            for(let i=0; i<list.length;i++){
                let data=list[i]; 
                const itemElement = document.createElement('div');
                itemElement.classList.value = 'card';
                itemElement.innerHTML = `
                <div class="image">
                
              </div>
              <div class="content">
                <div class="header"><dd>${data.name}</dd></div>
                <div class="meta">
                  <a>Friends</a>
                </div>
                <div class="description">
                  <dd> ${data.product_no}</dd>
                </div>
              </div>
              <div class="extra content">
                <span class="right floated">
                  Joined in 2013
                </span>
                <span>
                  <i class="user icon"></i>
                  75 Fri
                </span>
              </div>`
                listElement.append(itemElement);
                

            }
            

        }, error: function() {
            alert('에러임');
        }
    }); //ajax end
}

function getCategoryList(){
    const listElement = document.querySelector('.title');
    
    $.ajax({
        data: {
            // CATEGORY_NO: CATEGORY_NO
        },
        url: "/category/list",
        type: 'GET',
        dataType : "json",
        success: function(list) {
            let depth;
            for(let i=0; i<list.length-1;i++){
                let data=list[i];
                let data2=list[i+1]; 

    
     

                //const itemElement = document.createElement('div');
                //itemElement.classList.value = 'card';
                //itemElement.innerHTML = ``;
               // listElement.append(itemElement);
                
                


            }
            

        }, error: function() {
            alert('에러임');
        }
}); //ajax end
}


function productListMain(){
    console.log("product.sj 로드");

    $('.ui.accordion')
    .accordion()
    ;

    //getCategoryList();
}



document.addEventListener("DOMContentLoaded", productListMain);


// function main(){
//     $('.ui.accordion')
//     .accordion()
//   ;
// }


