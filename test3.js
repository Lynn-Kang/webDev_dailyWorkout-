/**
2021.11.11
 * 
 */

/* DATE can only be possible : NO-parameter or greater than two-parameter */
	const d = new Date();
	document.getElementsByClassName('data')[0].innerHTML = "<hr>" + d;
	const specific_d = new Date(2021, 10, 11, 9, 32);// Year, Month : 0 to 11, day, hour, minutes
	document.getElementsByClassName('data')[1].innerHTML = specific_d;
	const millisecond_d = new Date(1636600000000);// milliseconds (1day:86 400 000)
	document.getElementsByClassName('data')[2].innerHTML = millisecond_d;
	const readable_d = d.toDateString();
	document.getElementsByClassName('data')[3].innerHTML = readable_d;
	const dateParseto_milli = Date.parse("Nov 11, 2021");
	
	// parsing DATE
	document.getElementsByClassName('data')[4].innerHTML = dateParseto_milli;

/* MATH OBJECT */
	/* feature : Unlike other objects, has NO constructor.*/
	document.getElementsByClassName('mathData')[0].innerHTML = "<br>" + Math.E; //Euler's number(related to logarithm)
	document.getElementsByClassName('mathData')[1].innerHTML = Math.abs(-5);
	document.getElementsByClassName('mathData')[2].innerHTML = Math.random(); // number BTW 0 <= x < 1
	document.getElementsByClassName('mathData')[3].innerHTML = Math.floor(Math.random() * 101); // 0 to 100

/* BOOLEAN VALUES */
	/* feature : Comparing two Js Objects always return false */

/* CONDITIONS, SWITCH */
	const time = new Date().getHours();
	let greeting; // declared
	if (time < 10) {
		greeting = "Guten Morgan"; // initialized depending on conditions
	} else if (time < 19) {
		greeting = "Guten Tag";
	} else {
		greeting = "Guten Abend";
	}
	document.getElementsByClassName('conditionData')[0].innerHTML = "<br>" + greeting;
	
	let text;
	switch (new Date().getDay()) {
		case 6:
			text = "Today is Saturday";
			break;
		case 0:
			text = "Today is Sunday";
			break;
		default:
			text = "Looking forward to the Weekend :)";
	}
	document.getElementsByClassName('conditionData')[1].innerHTML = text;

/* LOOP */
	const info = { fname: "donghee", lname: "kang", nick: "lynn", address: "gangdong " };
	let txt = "";
	for (let data in info) {	// For-In LOOP : through the properties of an Object
		txt += " " + info[data];
	}
	document.getElementsByClassName('loopData')[0].innerHTML = txt;
	
	const season = ["SPRING", "SUMMER", "AUTUMN", "WINTER"];
	let circulation = "";
	season.forEach(func);	// forEach (method) LOOP 
	
	function func(value) {
		circulation += "<li>" + value + "</li>";
	}
	document.getElementsByClassName('loopData')[1].innerHTML = "<ul>" + circulation + "</ul>";

// For-Of LOOP : through the values of an iterable Obeject(i.e. Arrays, String, Sets, Maps etc.)
	// Browser Support : NOT supported in IE.

/* SETS */
	// feature : value can be invoked only once in a set.
	const burgerSet = new Set(["coke", "cheeseBurger", "fries"]);
	let receipt = "";
	burgerSet.forEach(function (value) {
		receipt += value + "<br>";
	})
	
	document.getElementById("burgerOrder").innerHTML = receipt; // another text editor can, but Eclipse cannot. Why?

/* MAPS */
	// feature : key-value pairs, size (Array is length, Maps is size)
	const cafeMenu = new Map([
		["ESPRESSO", 2500],
		["AMERICANO", 3000],
		["CAFELATTE", 3500],
		["CAFEMOCHA", 3500],
		["ICETEA",1500]
	]);
	cafeMenu.set("CAKE",2500);

	let menuBoard = "";
	for (const x of cafeMenu.entries()) {
		menuBoard += x + "<br>";
	}
	document.getElementById("upperBorder").textContent = "【 - - - - - - - 】";
	document.getElementById("cafeMenuBoard").innerHTML = menuBoard; // another text editor can, but Eclipse cannot. Why?
	document.getElementById("lowerBorder").textContent = "【 - - - - - - - 】";

/* TYPE-OF */
	typeof NaN;		// Returns number
	typeof function() {};	// Returns function
	typeof null;	// Returns object (objects, arrays also object type)
	typeof undefined;	// Returns undefined

/* TYPE CONVERSION */
	//    Converting Strings to Numbers
	document.getElementById("convStrToNum").innerText= Number("3.14");
		
	//    Converting Numbers to Strings
	document.getElementById("convNumToStr").innerText = String(123);
	
	//    Converting Booleans to Strings
	document.getElementById("convBooToStr").innerText = String(true);
	
	var data = false;
	document.getElementById("cpmvBppToStr_2").innerText = data.toString();

/* ERRORS : THROW & TRY - CATCH */

	// throw STATEMENT : creating custom error.
	function myFunction() {
    	const message = document.getElementById("p01");
     	message.innerHTML = "";
	    let x = document.getElementById("errExam").value;
	    try {
	        if(x == "") throw "empty";
	        if(isNaN(x)) throw "not a number";
	    	x = Number(x);
	    	if(x < 5) throw "too low";
	    	if(x > 10) throw "too high";
	  	}
	  	catch(err) {
	    	message.innerHTML = "Input is " + err;
	  	}
	  	/* finally {
	  		// REGARDLESS OF the result, executing code after TRY-CATCH.
		}*/	
	}
	
/* */