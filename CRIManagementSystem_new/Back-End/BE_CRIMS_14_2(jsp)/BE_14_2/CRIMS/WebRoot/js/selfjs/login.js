$(document).ready(function() {

	$(':input[name=user]').blur(function() {
		if($('#user').val() != "") {
			$('.no').css('display', 'none');
		}
	});

	$(':input[name=psw]').blur(function() {
		if($('#psw').val() != "") {
			$('.psw').css('display', 'none');
		}
	});

	$('#login').validate({
		rules: {
			user: {
				required: true,
			},
			psw: {
				required: true,
			},
			remote: {
				url: '',
				type: 'POST',
				data: function() {
					return $('#user').val();
				},

			}
		},
		messages: {
			user: {
				required: '请输入账号！',

			},
			psw: {
				required: '请输入密码！',
				remote: '账号或密码不正确',
			},

		}

	});

});