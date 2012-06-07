
$(document).ready(function() {

	$('a.modal').click(function (e) {
		
		e.preventDefault();
		
		var href = this.href.replace(/\/app\//, "/ajax/");
		
		$.get(href, function(data){
			$(data).modal({
				position: ["15%",],
				onShow: formDisplay
			});
		});

	});

} );

function formDisplay() {
	
	$('#simplemodal-container form').submit(function (e) {
		e.preventDefault();

		var action = this.action.replace(/\/app\//, "/ajax/");
		$.ajax({
			url: action,
			data: $('#simplemodal-container form').serialize(),
			type: 'post',
			cache: false,
			dataType: 'html',
			success: formSuccess,
			error: formError
		});

	});
	
}

function formSuccess(data) {
	alert(data);
	$.modal.close();
	//$('#content').html(data);
}

function formError(xhr) {
	alert(xhr.statusText);
}
