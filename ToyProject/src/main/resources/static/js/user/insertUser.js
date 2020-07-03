$(document).ready(function() {
	
	// 아이디 충복 체크 필드
	overlapUserId = "N";
	// 비밀번호 동일여부 체크
	password_check = false;
	
	// 이메일 도메인을 변경하려고 할 때 
	$("#email_select").on("change", function() {
		if (this.value == "self_typing") {
			console.log("changed doamin value : " + this.value)
			// 도메인 값을 초기화 하고 포커스를 이동시킨다
			$("#email_domain").val("").focus()
							  .attr("readonly", false);
		} else {
			$("#email_domain").val(this.value)
							  .attr("readonly", true);
		}
		
	});
	
//  회원가입 버튼을 눌렀을 때
    $("#signupbtn").click(function(){
    	// 비밀번호가 서로 동일한지 체크해야함 
    	if (password_check) {
    		signUpProcess();    	
    	}
    });
	
});


// 회원가입을 처리한다
function signUpProcess() {
	// 필드 초기화    
    var sign_obj = {
    	"userid" : $("#userid").val(), // 아이디
    	"password": $("#password").val(), // 패스워드
    	"password_repeat": $("#password_repeat").val(), // 패스워드 확인
    	"username": $("#username").val(), // 이름
    	"address": $("#addr1").val(), // 주소
    	"adddetail": $("#addr2").val(), // 상세한 주소
    	"postcode": $("#postcode").val(), // 우편번호
    	"phone": $("#phone").val(), // 전화번호
    	"email": $("#email").val() + "@" + $("#email_domain").val(), // 이메일
    	"authCode": $("#auth_selecter").val() // 권한 코드    	
    }
    
	// 유효성 검사 결과(true=>이상없음, false=>오류)
	var valid_yn = validateSignUpForm(sign_obj);
    console.log("전체 유효 테스트 : " + valid_yn)
	if (valid_yn) {
	//  REQUEST 통신
		$.ajax({
			type : "post",
			url : "/user/insertUser",
			data : {
				"userId": sign_obj.userid,
				"password": sign_obj.password,
				"name": sign_obj.username,
				"phone": sign_obj.phone,
				"zcode": sign_obj.postcode,
				"addr1": sign_obj.address,
				"addr2": sign_obj.adddetail,
				"email": sign_obj.email,
				"authCode": sign_obj.authCode,
				"grade": "100",
				"useYn": 'Y',
				"point": 0
			},			
			success : function(result) {
				if(result == "200") {
					console.log("회원가입 끝");
					// loginAfterSignup(userid, password, action)
					//location.href = "users/login.do"
				}
			}
		});		
	}
}

// 회원가입 폼의 유효성 체크를 한다
function validateSignUpForm(signObj) {
//  휴대전화 정규표현식 검사
	if (!regExpCheck(signObj.phone, "MOBILE") && !isEmpty(signObj.phone)){
		alert("mobile value is out of forms!")
		return false;
	} else if(isEmpty(signObj.phone)) {
		// 값이 비어있을 때
		alert("mobile value is Empty");
		return false;
	}
	
	//  이메일 정규표현식 검사
    if (!regExpCheck(signObj.email, "EMAIL") && !isEmpty(signObj.email)) {
		alert("email value is out of forms!");       	
		return false;    	
	} else if(isEmpty(signObj.email)) {
		// 값이 비어있을 때
		alert("email value is Empty");
		return false;
	}

    if (isEmpty(signObj.authCode)){
    	alert("write your authCode");
    	return false;
    }
    
    if (isEmpty(signObj.userid)){
    	alert("write your userid");
    	return false;
    } 
    if (isEmpty(signObj.password)){
    	alert("write your password");
    	return false;
    }
    
    if (signObj.password_repeat != signObj.password){
    	alert("not equals password with password_repeat");
    	return false;
    }        

    if (isEmpty(signObj.username)){
    	alert("write your username");
    	return false;
    }
    
    if (isEmpty(signObj.address)){
    	alert("write your address");
    	return false;
    }    
    
    return true;
}

//값이 NULL 값이거나 빈 값인지 체크한다
function isEmpty(value) {
	if(value == null || value.trim() == "") {
		return true;
	}
	return false;
}

//휴대전화와 이메일 정규표현식 체크
function regExpCheck(value, code) {
	var regExp = null;
	
	if (code == "EMAIL") {
		regExp = /^[0-9a-zA-Z]*[-_]?[0-9a-zA-Z]*@[0-9a-zA-Z]([-_]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
		console.log("이메일 유효 값 : " + regExp.test(value));
		return regExp.test(value) 
	}
	
	if (code == "MOBILE") {
		regExp = /^01[0-9]{1}\d{3,4}\d{4}$/;
		console.log("휴대폰 유효 값 : " + regExp.test(value));
		return regExp.test(value)
	}
	
}

// 숫자만 입력 받도록 검사하는 함수
function checkOnlyNumberPress(object) {
	// g : '/' 사이의 모든 문자를 체크 
	// i : 대소문가 구별 없이 체크
	
    regexp = /[^0-9]/gi;
    v = object.value;
    // 숫자 외에 다른 글자가 들어오면 true를 반환
    if (regexp.test(v)) {
        alert("숫자만 입력가능 합니다.\n-(하이픈)을 제외한 숫자만 입력하여 주세요.");
        object.value = v.replace(regexp, '');
    }

    //숫자는 11자리까지만 가능하도록 처리 하는 부분
    regexp = /^\d{10,11}$/gi;
    v = object.value;
    // console.log(v.length + "->" + regexp.test(v))
    
    if (!regexp.test(v) && v.length > 11) {
        alert("숫자는 11자리까지만 입력가능 합니다.");        
        object.value = v.slice(0, -1);
    }  
}

// 비밀번호가 같은지 체크한다
function checkEqualsPassword(object) {
	console.log(password_check)
	// 비밀번호 필드	
    password = document.getElementById("password");
    conf_pw_span = document.getElementById("conf_pw_span");
    // 패스워드 필드 모두 빈 값이 아닌지 체크한다
    if (!isEmpty(object.value) && !isEmpty(password.value)) {
    	
    	if (object.value != password.value) {
    		// 비밀번호가 다르면 password_check 값을 다시 false로 변경
    		password_check = false;
    		conf_pw_span.innerHTML = "비밀번호가 서로 다릅니다";
    	} else {
    		// 비밀번호가 같다면 true로 변경
    		password_check = true;
    		conf_pw_span.innerHTML = "";
    	}
    	
    }
    
}

//주소찾기 팝업창을 연다
function openSearchZCodePopup() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var addr = ''; // 주소 변수
            var extraAddr = ''; // 참고항목 변수

            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                addr = data.roadAddress;
            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                addr = data.jibunAddress;
            }

            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
            if(data.userSelectedType === 'R'){
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraAddr !== ''){
                    extraAddr = ' (' + extraAddr + ')';
                }
                // 조합된 참고항목을 해당 필드에 넣는다.
                //document.getElementById("addr1").value = extraAddr;
            } 

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('postcode').value = data.zonecode;
            document.getElementById('addr1').value = addr;
            // 커서를 상세주소 필드로 이동한다.
            document.getElementById("addr2").focus();
        }
    }).open();
}

