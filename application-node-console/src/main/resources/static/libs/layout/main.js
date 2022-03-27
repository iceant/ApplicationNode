System.register(['./template.html', './style.css'], function(_e){
    var html;
    return{
      setters:[
          function(_){html=_.default;}
      ],
      execute:function(){
          _e({
              template:html,
              data(){
                  return {
                      menus:[]
                  };
              },
              mounted(){
                  var self = this;
                  axios.get('/Menu/firstLevel').then(function(resp){
                      self.menus = resp.data.result;
                      console.log(self.menus);
                  });
              },
              methods:{
                  getMenu(id){
                      for(var k in this.menus){
                          var item = this.menus[k];
                          if(item.id===id){
                              return item;
                          }
                      }
                  },
                  handleOpen(id){
                      var self = this;
                      axios.get('/Menu/'+id+'/children').then(function(res){
                          var menu = self.getMenu(id);
                          menu.children = res.data.result;
                      });
                  },
                  handleClose(){
                      console.log('close', arguments);
                  },
                  handleItemClick(){
                      console.log(arguments);
                      this.$router.push({path: '/about', query:{message:arguments}});
                  }
              }
          });
      }
    };
});