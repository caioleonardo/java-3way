<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<title>Nome e Profissão</title>
</head>
<body>
		<div class="col-sm-6">
		<div class="panel panel-primary">
		<div class="panel-heading">Cadastro</div>
		<div class="panel-body">
			<form method="post" action="ExercicioServlet">
				<div class="row">
					<fieldset>
						<div class="form-group">
							<label form="nome">Nome</label>
							<input type="text" class ="form-control" id="nome" name="nome" autofocus required>
						</div>
						<div class="form-group">
							<label form="profissao">Profissão</label>
							<input type="text" class ="form-control" id="profissao" name="profissao" required>
						</div>
						</fieldset>
				</div>
			<input type="submit" class="btn btn-primary" value="Confirmar" />
			</form>
		</div>
		</div>
		</div>
</body>
</html>