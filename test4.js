/**
2021.11.12
 * 
 */

/* SCOPE */
// block scope : let 
{
	let valeOfLet = 2;
	document.getElementById("letInBlockScope").innerHTML = "<hr>" + "innerLet: " + valeOfLet;
}
//document.getElementById("letOutOfBlockScope").innerHTML = "outerLet: " + valeOfLet ;

/* HOISTING */
hoistingTest = "F/W Season";
elem = document.getElementById("hoisting");
elem.innerText = hoistingTest + "( " + typeof hoistingTest + " )";
var hoistingTest; // Declare after using variables (var)

let hoistingTest2;
hoistingTest2 = "clothes";
document.getElementById("hoistingLet").innerText = hoistingTest2;

const hoistingTest3 = "are expensive, but really warm";
document.getElementById("hoistingConst").innerText = hoistingTest3;
//let hoistingTest2;
//const hoistingTest3;

/* THIS KEYWORD */
const card = {

	firstName: "Lynn",
	lastName: "Kang",
	id:105937,
	idCard: function makeIdCard() {
		return this.id + " / " + this.firstName + " " + this.lastName;// this in an Object method
	}
}
document.getElementById("thisInObject").innerText = card.idCard();

document.getElementById("thisInFunctionDefault").innerText = windowFunction();
function windowFunction() {
	return this.alert('this in Function : default'); // this in a Function (default)
}

//document.getElementById("thisInFunctionStrict").innerText = strictFunc(); 
function strictFunc() {
	return this; // this in a Function (strict)
}

/* ARROW FUNCTION */
greeting = () => "Hi Everyone~~~";		//	only 1 statement
document.getElementById("arrowFunction").innerText = greeting();

item = window.prompt("Now, put your with-to-buy Item :");
wishItem = (item) => "OK. I will buy you " + item + " someday ! ^___^ ";	//	with Parameter
//wishItem = item => "OK. I will buy you " + item + " someday ! ^___^ ";	// 파라미터1개면 괄호생략도 됨
document.getElementById("arrowFunctionParameter").innerText = wishItem(item);

/* CLASSES */
class Movie {	// Js Class is template! (NOT an Object)
	constructor(title, ost) {	// always named constructor(), initialize object properties
		this.title = title
		this.ost = ost
	}
}
let favoriteMovie = new Movie("Frozen", "Let it go");
document.getElementById("movie").innerText = favoriteMovie.title + " ♬" + favoriteMovie.ost;

/* JSON (JavaScript Object Notation) */
	// feature : syntax is derived from Js Object notation syntax, but format is text only (written in any programming language)

	// Convert JSON text to Js Obejct 
	let orders = ' { "orders": [' +
		'{ "burger":"cheeseBurger", "beverage":"coke", "number":"1" },'+
		'{ "burger":"chickenBurger", "side":"cheeseStick", "number":"2" },'+
		'{ "burger":"squidGameBurger", "event":"yes", "number":"3" } ]}';
	
	const obj = JSON.parse(orders);
	document.getElementById("jsonToJsObject").innerText = 
	"♡ ORDER ♡ " + obj.orders[0].burger + " , " + obj.orders[0].number;
