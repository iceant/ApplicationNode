System.register(['./template.html'], function(_e){
    var html;
    return {
      setters:[function(_){html=_.default;}],
      execute(){
          _e({
              template: html
          });
      }
    };
});