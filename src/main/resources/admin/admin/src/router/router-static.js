import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/shijuanliebiao/exam'
    import ershoushuji from '@/views/modules/ershoushuji/list'
    import shujifenlei from '@/views/modules/shujifenlei/list'
    import maijia from '@/views/modules/maijia/list'
    import yonghu from '@/views/modules/yonghu/list'
    import peizhiguanli from '@/views/modules/peizhiguanli/list'
    import ershoushujidingdan from '@/views/modules/ershoushujidingdan/list'
    import yingyinfenlei from '@/views/modules/yingyinfenlei/list'
    import storeup from '@/views/modules/storeup/list'
    import users from '@/views/modules/users/list'
    import ershouyingyin from '@/views/modules/ershouyingyin/list'
    import ershouyingyindingdan from '@/views/modules/ershouyingyindingdan/list'

//2.配置路由   注意：名字
const routes = [
    {
        path: '/index', name:'index', component: Index, children: [{
            // 这里不设置值，是把main作为默认页面
            path: '/',
            name: 'home',
            component: Home
        },{
            path: '/updatePassword',
            name: 'updatePassword',
            component: UpdatePassword
        } ,{
            path: '/pay',
            name: 'pay',
            component: pay
        } ,{
            path: '/center',
            name: 'center',
            component: center
        } 
                    ,{
                path: '/ershoushuji',
                name: 'ershoushuji',
                component: ershoushuji
            } 
                    ,{
                path: '/shujifenlei',
                name: 'shujifenlei',
                component: shujifenlei
            } 
                    ,{
                path: '/maijia',
                name: 'maijia',
                component: maijia
            } 
                    ,{
                path: '/yonghu',
                name: 'yonghu',
                component: yonghu
            } 
                    ,{
                path: '/peizhiguanli',
                name: 'peizhiguanli',
                component: peizhiguanli
            } 
                    ,{
                path: '/ershoushujidingdan',
                name: 'ershoushujidingdan',
                component: ershoushujidingdan
            } 
                    ,{
                path: '/yingyinfenlei',
                name: 'yingyinfenlei',
                component: yingyinfenlei
            } 
                    ,{
                path: '/storeup',
                name: 'storeup',
                component: storeup
            } 
                    ,{
                path: '/users',
                name: 'users',
                component: users
            } 
                    ,{
                path: '/ershouyingyin',
                name: 'ershouyingyin',
                component: ershouyingyin
            } 
                    ,{
                path: '/ershouyingyindingdan',
                name: 'ershouyingyindingdan',
                component: ershouyingyindingdan
            } 
                ]
    },
    { path: '/adminexam', name: 'adminexam', component: adminexam },
    { path: '/login', name:'login', component: Login },
    { path: '/register', name:'register', component: register },
    { path: '/', redirect: '/index/' },      /*默认跳转路由*/
    { path: '*', component: NotFound }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
    mode: 'hash',   /*hash模式改为history*/
    routes // （缩写）相当于 routes: routes
})

export default router;

