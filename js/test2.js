/**
 2021.11.10
 * 
 */
document.getElementById("title").innerHTML = "It's me";

/* OBJECT DEFINITION */
const person = {
	firstName: "John",
	lastName: "Doe",
	id: 5566,
	age: 50,
	eyeColor: "blue",
	fullName: function() {
		return this.firstName + " " + this.lastName;
	}
}

/* EVENTS */
function displayDate() {
	document.getElementById("event").innerHTML = Date();
}

/* STRING vs. OBJECT*/
let x = "John";        		 // x is a string
let y = new String("John");  // y is an object
document.getElementById("string").innerHTML = (x == y); //same value?
document.getElementById("string2").innerHTML = (x === y); //same value & dataType?

/* NUMBERS */
/* '+' is special for JavaScript(add,concatenate) */
function calculate() {

	let x = 10;
	let y = 20;
	let z = "30";
	let result = x + y + z;

	document.getElementById('number').innerHTML = result;
}

function numberVsObj() {
	let x = 123;
	let y = new Number(123);

	document.getElementById('numberVsObj').innerHTML = '123: ' + typeof x + ', ' + ' new Number(123): ' + typeof y;
}

/* Arrays */

function arrayVsObj() {

	const personArr = ["John", "Doe", 46];
	const personObj = { firstName: "John", lastName: "Doe", age: 46 };

	document.getElementById('arrayVsObj').innerHTML = 'Array: ' + personArr[0] + ',' + 'Object: ' + personObj.firstName;
}

function arrayForLoop() {

	const fruits = ["Blueberry", "Rasberry", "Apple", "Strawberry", "Kiwi"];
	let fLen = fruits.length;

	text = "<ul>";
	for (let i = 0; i < fLen; i++) {
		text += "<li>" + fruits[i] + "</li>";
	}
	text += "</ul>";

	document.getElementById("arrayForLoop").innerHTML = text;
}

/* forEach : 앞의 변수가 가리키는 literal들이 forEach의 파라미터로 들어가는 함수의 argument 로 순서대로 value로서 들어간다 */
function arrayForEachLoop() {

	const clothes = ["Skirt", "One-piece", "Shirt", "Sweater", "Pants", "Coat"];
	let cloSort = clothes.sort();

	let text = "<ol>";

	cloSort.forEach(myFunction);
	text += "</ol>";
	document.getElementById("arrayForEachLoop").innerHTML = text;

	function myFunction(value) {
		text += "<li>" + value + "</li>";
	}
}

/* Arrays only use numbered indexes */
function arrayVsObj2() {

	const application = [];
	application["IDE"] = "Eclipse";
	application["OS"] = "Windows";
	application["DBMS"] = "SQL_Developer";
	application.length;
	application[2];

	document.getElementById("arrayVsObj2").innerHTML =
		application[0] + " " + application.length;
}
