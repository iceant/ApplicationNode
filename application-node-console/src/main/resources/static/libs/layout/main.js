System.register(['./template.html', './style.css'], function(_e, _c){
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
                          for(var i in item.children){
                              var child = item.children[i];
                              if(child.id===id) return child;
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
                  handleItemClick(item){
                      var self = this;
                      var id = item.index;
                      var menu = this.getMenu(id);
                      _c.import('..'+menu.path+'/main.js').then(function(m){
                          self.$router.addRoute({path:menu.path, component:m});
                          self.$router.push({path: menu.path});
                      });
                  }
              }
          });
      }
    };
});