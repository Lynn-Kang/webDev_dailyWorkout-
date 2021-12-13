$(function () {

  // NOTE: Some of the selectors below overlap. To see the exact effect of one
  // of them, please comment out all others.

  // To select elements in jQuery, you can simply use any CSS selector inside
  // the $() function by passing it in as a string.

  // Select all paragraph tags
  var p = $("p");
  highlight(p);

  // Select all elements with the class .red-box (only one in this case)
  var blueBoxes = $(".blue-box");
  var content = $(":contains(Blue)");
  becomeEmerald(blueBoxes);
  blueFonts(content);

  // Select the unique element with ID "list"
  var list = $("#list");
  var liInUl = $("ul > li > ul");
  redFonts(list);
  highlight(liInUl);

  // Select all h2, p, and input tags
  var elements = $("h2, p, input");
  becomeBlack(elements);
  whiteFonts(elements);

  // Select only the last <li> on the page
  var lastItem = $("li:last");
  blueFonts(lastItem);

  // Select all even list items on the page (every second list item)
  var everySecondItem = $("li:even");
  //highlight(everySecondItem);

  // Select all odd list items (every other list item)
  var everyOtherItem = $("li:odd");
  //highlight(everyOtherItem);

  // Select all input elements that are checked/selected
  // Checkboxes and radio buttons don't have background-color
  var selected = $("input:checked");
  console.log(selected.length);

  // Select all input elements of type email
  var emails = $("input[type=email]");
  highlight(emails);

});

// (beyond $(function () {})

  // Helper function which highlights the given element with yellow background
  // 1. background-color list
function highlight(element) {
  element.css("background-color", "rgba(255, 255, 0, 1)");
}

function becomeEmerald(element) {
  element.css("background-color", "rgba(0, 200, 0, 0.3)");
}

function becomeWhite(element) {
  element.css("background-color", "rgba(256, 256, 256, 0.9)");
}

function becomeBlack(element) {
  element.css("background-color", "rgba(0, 0, 0, 0.9)");
}

function becomeEmerald(element) {
  element.css("background-color", "rgba(0, 200, 0, 0.3)");
}

  //2. font list
function redFonts(element) {
  element.css("color", "rgba(256, 0, 0, 0.8)");
}

function blueFonts(element) {
  element.css("color", "rgba(0, 0, 255, 1)");
}

function whiteFonts(element) {
  element.css("color","rgba(256, 256, 256, 0.9)");
}
