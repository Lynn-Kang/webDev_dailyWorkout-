$(function () {

  $(".red-box").fadeTo(1000, 0, function() {

    // callback function : parameter로 함수가 와서 앞의 함수 시행 후에 곧바로 시행됨
    $(".green-box").fadeTo(1000, 0, function() {
      $(".blue-box").slideUp(1000, function() {
        $(".pink-box").slideDown(1000, function() {
          alert('콜백함수 개념끝!');
        });
      });
    });
  });
});
