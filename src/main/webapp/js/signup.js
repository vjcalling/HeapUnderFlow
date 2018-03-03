
$(document).ready(function() {


//------------------------------------------------------------------------------------------
		

	$('#signupform').validate({ // initialize the plugin
		rules: {
			firstname1: {
				required: true,
				minlength: 5
			},
			lastname1: {
				required: true,
				minlength: 5
			},
			email1: {
				required: true,
				email: true
			}
		},
		submitHandler: function (form) { 
			alert('valid form submitted');

				var firstname = $("#firstname").val();
				var lastname = $("#lastname").val();
				var username = $("#username").val();
				var email = $("#email").val();
				var password = $("#password").val();

				var user1 = {"firstName":firstname, "lastName":lastname, "username":username, "email":email, "password":password};
				alert(JSON.stringify(user1));

				$.ajax({
					type: "POST",
					contentType: "application/json; charset=utf-8",
					async: false,
					data: JSON.stringify(user1),
					dataType:"text",
					url: "/heapunderflow/service/user/signup",
					success: function(data) {
						sessionStorage.token = data;
						alert('Got a token from the server! Token: ' + data);
					},
					error: function() {
						alert("Signup Failed");
					}
				});		
		}
	});

//------------------------------------------------------------------------------------------
	

});
