System.register(['layout', './style.css'], function(_e){
    var Layout;

    return{
        setters:[function(_){Layout=_;}],
        execute(){
            const app = Vue.createApp(Layout);

            app.use(ElementPlus);
            for(var k in ElementPlusIconsVue){
                app.component(k, ElementPlusIconsVue[k]);
            }

            const router = VueRouter.createRouter({
                history: VueRouter.createWebHashHistory(),
                routes:[],
            })
            app.use(router);

            app.mount("#app");
        }
    }
});