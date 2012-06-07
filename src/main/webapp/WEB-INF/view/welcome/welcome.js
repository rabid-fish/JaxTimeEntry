
$(document).ready(function() {
	setInterval("updateTime()", 1000);
	updateTime();
});

function updateTime() {
	
	$.getJSON("welcome/getTime", function(data) {
		$("#theTime").html(data.theTime);
	});
};
