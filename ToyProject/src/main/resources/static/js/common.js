/**
 * header.html
 * footer.html
 */

function fnSignIn(){
    location.href = '/user/loginUser'
    /* self.location = '/user/loginUser'; */
}

function fnSignUp(){
    self.location("/user/insertUser");
}
/*  function loadScript(url, callback){
     var script = document.createElement('script');
     script.src = url;
     script.onload = callback;

     document.getElementsByTagName('head')[0].appendChild(script);
 }
 */