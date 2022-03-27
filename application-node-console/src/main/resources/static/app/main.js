System.register(['layout', './utils.js', './style.css'], function(_e){
    var Layout;
    var Utils;

    return{
        setters:[
            function(_){Layout=_;}
            ,function (_){Utils=_;}
        ],
        execute(){
            ////////////////////////////////////////////////////////////
            //// Axios
            axios.defaults.baseURL=Utils.meta("baseURL");

            ////////////////////////////////////////////////////////////
            //// Vue
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