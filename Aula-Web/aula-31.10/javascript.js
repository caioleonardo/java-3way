function buscar(titulo) {
		alert('O valor recebido por parâmetro foi:' +titulo.value);

		var livros = ["nome do livro 1", "nome do livro2", "nome do livro3"];
		var filmes = ["Venon", "Vingadores", "Sinais"];

		if (titulo.value == "livros") {
			alert(livros);
		} else if (titulo.value == "filmes") {
			alert(filmes);
		}
		// var idade = prompt('Digite sua idade');

		// if (idade < 12) {
		// 	alert('Crianca.');
		// }
		// else if (idade < 14) {
		// 	alert('Pre-adolescente.');
		// }
		// else if (idade < 18) {
		// 	alert('Adolescente.');
		// }
		// else if (idade <= 60) {
		// 	alert('Adulto.');
		// }
		// else {
		// 	alert('Idoso')
		// }
		// var Moto = {
		// 	Marca: "Honda",
		// 	Modelo: "Hornet",
		// 	Cor: "Preta"
		// }
		// for (descricao in Moto) {
		// 	document.write(descricao + Moto[descricao])
		// }	
	}