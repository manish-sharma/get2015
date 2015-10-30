
  
  $(document).ready(function() {
    $("[name=toggler]").click(function(){
            $('.toHide').hide();
            $("#blk-"+$(this).val()).show('slow');
    });
 });