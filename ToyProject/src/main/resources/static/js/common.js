/**
 * header.html
 * footer.html
 */

function fnSignIn(){
    self.location = '/user/loginUserView';
}

function fnSignUp(){
    self.location= '/user/insertUserView';
}
/*  function loadScript(url, callback){
     var script = document.createElement('script');
     script.src = url;
     script.onload = callback;

     document.getElementsByTagName('head')[0].appendChild(script);
 }
 */