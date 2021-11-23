$(function () {
      
  $(".red-box").fadeTo(3000,0.2);
  $(".green-box").fadeTo(2000,0.5);
  $(".blue-box").fadeTo(1000,0.8);

  //fadeIn our fadeOut depending on the element's situation. (stores opacity)
  $(".blue-box").fadeToggle(); 
  $(".blue-box").fadeToggle();

  $(".green-box").fadeToggle();
  $(".green-box").fadeToggle();  
});
