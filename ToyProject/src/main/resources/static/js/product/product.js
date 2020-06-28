function btnClick(){
    alert("클릭 이벤트");
}


function selectProductList(e){
  event.preventDefault();
  event.stopPropagation();

  let categoryNo=e;
  if(isNaN(categoryNo)){
    categoryNo=e.target.dataset.categoryNo;
    
  }

    const listElement = document.querySelector('.cards');
    
    
    $.ajax({
        data: {
          "categoryNo" : categoryNo
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
                <div class="header"><dd><a href="/product/detail?id=${data.name}"></a></dd></div>
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

function childCategoryList(e){
  let categoryNo=e;
  if(isNaN(categoryNo)){
    e.stopPropagation()
    categoryNo=e.target.dataset.categoryNo;
  }
  const listElement = document.getElementById("liId"+categoryNo);

    $.ajax({
        data: {
            "categoryNo" : categoryNo
        },
        url: "/category/list",
        type: 'GET',
        dataType : "json",
        success: function(list) {
            
            while(listElement.firstElementChild) {
              listElement.removeChild(listElement.firstElementChild);
            }
            for(let i=0; i<list.length;i++){
                let category=list[i];

              //   const itemElement2 = document.createElement('i');
              //   itemElement2.id="iId"+category.category_no;
              //   itemElement2.dataset.categoryNo=category.category_no;
              //   itemElement2.className="dropdown icon";
              //  itemElement2.addEventListener('click', childCategoryList);

                const itemElement = document.createElement('li');
                itemElement.id="liId"+category.category_no;
                itemElement.dataset.categoryNo=category.category_no;
                itemElement.textContent=category.name;
               itemElement.addEventListener('click', selectProductList);

            //   listElement.append(itemElement2);
               listElement.append(itemElement);
               
            }
            

        }, error: function() {
            alert('에러임');
        }
}); //ajax end
}


function productListMain(){

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


