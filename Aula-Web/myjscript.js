 function myFunction() {
 			document.getElementById("demo").innerHTML = "Paragraph changed.";
 		}
function myFunction2() {
 			document.getElementById("demo").style.fontSize = "35px";
 		}
function myFunction3() {
 			document.getElementById("demo").style.fontSize = "15px";
 		}
function myFunction4() {
 			document.getElementById("demo").innerHTML = "Paragraph changed again.";
 		}
function myFunction5() {
 		 			document.getElementById("demo").style.display = "none";
 		 		}
function validateForm() {
	var x = document.forms["myForm"]["fname"].value;
	if (x == ""){
		alert("Name must be filled out");
		return false;
	}
}



