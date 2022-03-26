System.register(['./template.html', './style.css'], function(_e){
    var html;
    return{
      setters:[
          function(_){html=_.default;}
      ],
      execute:function(){
          _e({
              template:html,
              mounted(){
                  this.$router.addRoute({path:'/about', component:{
                          template:'<h1>{{message}}</h1>',
                          mounted(){
                              this.message = this.$route.query.message;
                          },
                          updated(){
                            this.message = this.$route.query.message;
                          }
                      }
                  });
              },
              methods:{
                  handleOpen(){
                      this.$router.push({path: '/about', query:{message:new Date()}});
                  },
                  handleClose(){
                      this.$router.push({path: '/about', query:{message:new Date()}});
                  },
                  handleClick(){
                      console.log(arguments);
                      this.$router.push({path: '/about', query:{message:new Date()}});
                  }
              }
          });
      }
    };
});