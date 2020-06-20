$(function(){

});

function test(){
    console.log("test");
    //$("form").attr("method","POST").attr("action","/product/updateProduct").submit();
    self.location="/main/mainPage";
}

function login(){
    self.location="/user/loginUser";
}