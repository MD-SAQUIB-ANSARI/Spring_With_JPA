
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<table class="table table-striped">
	
	<tr>
		<th>Emp No</th>
		<th>Emp Name</th>
		<th>Emp Salary</th>
	</tr>
	<tr>
		<td>${msg1}</td>
		<td>${msg2}</td>
		<td>${msg3}</td>
	</tr>
	
</table>
	</div>
	
	
	<form method="post" action="findRecord">
		<table >
			<caption>Employee Deletion Screen</caption>
			<tr>
				<td>Emp No</td>
				<td><input type="text" name="empNo"
					placeholder="Employee Number"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Rgister Employee"></td>
			</tr>
		</table>
		<a href="/">Home</a>
	</form>
</body>
</html>