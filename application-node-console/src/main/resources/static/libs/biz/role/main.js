System.register(['./template.html'], function(_e){
    var html;

    return {
      setters:[function(_){html=_.default;}],
      execute(){
          _e({
              template: html,
              data(){
                  return {
                      roles:[],
                      dialog:false,
                      addRoleForm:{
                          name:"",
                          description:""
                      },
                      addRoleFormRules:{
                          name: [
                              { required: true, message: '请输入角色名称', trigger: 'blur' }
                          ]
                      }
                  }
              },
              mounted(){
                  var self = this;
                  axios.get('/Role').then(function(res){
                      self.roles=res.data.result;
                  });
              },
              methods:{
                  reload(){
                      var self = this;
                      axios.get('/Role').then(function(res){
                          self.roles=res.data.result;
                      });
                  },
                  handleDeleteRow(id){
                      var self = this;
                      axios.delete('/Role/'+id).then(function(res){
                          if(res.data.result){
                              self.reload();
                          }
                      });
                  },
                  removeRole(id){
                      for(var k in this.roles){
                          console.log(k);
                          var role = this.roles[k];
                          if(role.id===id){
                              console.log(role, id);
                            this.roles.slice(k, 1);
                            break;
                          }
                      }
                  },
                  handleAdd(){
                      console.log('Add');
                  },
                  handleSubmit(){
                      console.log(arguments);
                      console.log('submit');
                      console.log(this.$refs);
                      console.log(this.$refs.addRoleFormRef);
                      var self = this;
                      axios.post('/Role', {name:this.addRoleForm.name, description:this.addRoleForm.description})
                          .then(function(res){
                              if(res.data.code==="200"){
                                  self.$refs.addRoleFormDrawer.close();
                                  self.reload();
                              }
                          })
                      ;
                  },
                  handleValidation(){
                      console.log(arguments);
                  }
              }
          });
      }
    };
});