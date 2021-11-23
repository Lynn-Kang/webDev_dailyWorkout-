$(function () {

  /** fadeOut vs. fadeTo : fading pitfall*/

 // case 1.
 $(".green-box").fadeOut(1000);

 // case 2.
 $(".green-box").fadeTo(1000,0);

 // case 3. 
 $(".green-box").fadeOut(1000);
 $(".green-box").fadeTo(1000,0.5);     
   
});
