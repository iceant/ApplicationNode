System.register(['layout', './style.css'], function(_e){
    var Layout;

    return{
        setters:[function(_){Layout=_;}],
        execute(){
            console.log(Layout);
            const app = Vue.createApp(Layout);

            app.use(ElementPlus);
            for(var k in ElementPlusIconsVue){
                app.component(k, ElementPlusIconsVue[k]);
            }
            app.mount("#app");
        }
    }
});