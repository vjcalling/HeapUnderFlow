$(document).ready(function() {

	var img = '<img src="assets/images/avatars/' + 2 + '.jpg" alt=""/>';
	$.ajax({
		type: "GET",
		contentType: "application/json; charset=utf-8",
		async: false,
		dataType:"text",
		url: "/heapunderflow/service/user",
		success: function(response) {
			$.each($.parseJSON(response), function(i, item) {
			      $('<tr>').append(
			          
			          '<td>' + img + '</td>',
			          $('<td>').text(item.username),
			          $('<td>').text(item.email),
					  $('<td>').text(item.firstName),
					  $('<td>').text(item.lastName)
			      ).appendTo('#records_table');
			  });
		},
		error: function() {
			alert("Signup Failed");
		}
	});		
});		
