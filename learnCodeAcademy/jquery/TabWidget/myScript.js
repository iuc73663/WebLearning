$(function(){

  $('.tab-panels .tabs li').on('click', function() {

    //removes any li tab that has active class
    $('.tab-panels .tabs li.active').removeClass('active');

    //add active to click on tab
    $(this).addClass('active');

    //Find panel attr from click on tab
    var pannelToShow = $(this).attr('rel');

    //find active panel
    $('.tab-panels .panel.active').slideUp(300, showNextPanel);

    //show next panel
    function showNextPanel() {
      $(this).removeClass('active'); // this belongs to current .panel.active


      $('#' + pannelToShow).slideDown(300, function() { //refers to attr from rel
        $(this).addClass('active');//refers to panel gotten from rel
      });
    }

  });

});
