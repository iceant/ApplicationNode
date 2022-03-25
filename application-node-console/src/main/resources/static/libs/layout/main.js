System.register(['./template.html', './style.css'], function(_e){
    var html;
    return{
      setters:[
          function(_){html=_.default;}
      ],
      execute:function(){
          _e({
              template:html
          });
      }
    };
});