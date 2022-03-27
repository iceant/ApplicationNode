System.register(['./template.html'], function(_e){
    var html;
    return {
      setters:[function(_){html=_.default;}],
      execute(){
          _e({
              template: html,
              data(){
                  return {
                      roles:[]
                  }
              },
              mounted(){
                  var self = this;
                  axios.get('/Role').then(function(res){
                      self.roles=res.data.result;
                  });
              }
          });
      }
    };
});