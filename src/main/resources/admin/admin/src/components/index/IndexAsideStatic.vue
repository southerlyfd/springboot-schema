<template>
  <el-aside class="index-aside" width="200px">
    <div class="index-aside-inner">
      <div v-for="item in menuList" v-bind:key="item.roleName">
        <el-menu
          default-active="0"
          v-if="role==item.roleName"
        >
          <el-menu-item @click="menuHandler('home')" index="0">首页</el-menu-item>
          <el-submenu
            :index="1+''"
          >
            <template slot="title">
              <span>个人中心</span>
            </template>
            <el-menu-item
              @click="menuHandler('updatePassword')"
              :index="1-1"
            >修改密码</el-menu-item>
             <el-menu-item
              @click="menuHandler('center')"
              :index="1-2"
            >个人信息</el-menu-item>
          </el-submenu>
          <el-submenu
            v-for=" (menu,index) in item.backMenu"
            v-bind:key="menu.menu"
            :index="index+2+''"
          >
            <template slot="title">
              <span>{{menu.menu}}</span>
            </template>
            <el-menu-item
              v-for=" (child,sort) in menu.child"
              v-bind:key="sort"
              @click="menuHandler(child.tableName)"
              :index="(index+2)+'-'+sort"
            >{{child.menu}}</el-menu-item>
          </el-submenu>
        </el-menu>
      </div>
      <!-- <div>
        <el-menu
          background-color="#ffffff"
          text-color="#333"
          active-text-color="#333"
          default-active="0"
        >
          <el-menu-item @click="menuHandler('home')" index="0">首页</el-menu-item>
          <el-submenu index="1">
            <template slot="title">
              <span>考试管理</span>
            </template>
            <el-menu-item @click="menuHandler('shijuanguanli')" index="1-1">试卷管理</el-menu-item>
            <el-menu-item @click="menuHandler('shitiguanli')" index="1-2">试题管理</el-menu-item>
            <el-menu-item @click="menuHandler('kaoshijilu')" index="1-3">考试记录</el-menu-item>
          </el-submenu>
          <el-submenu index="2">
            <template slot="title">
              <span>论坛管理</span>
            </template>
            <el-menu-item @click="menuHandler('luntangguanli')" index="2-1">论坛管理</el-menu-item>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title">
              <span>电影选座管理</span>
            </template>
            <el-menu-item @click="menuHandler('zuoweiguanli')" index="3-1">座位管理</el-menu-item>
          </el-submenu>
          <el-submenu index="4">
            <template slot="title">
              <span>餐厅预定管理</span>
            </template>
            <el-menu-item @click="menuHandler('zuoweiyudingguanli')" index="4-1">座位预定管理</el-menu-item>
          </el-submenu>
          <el-submenu index="5">
            <template slot="title">
              <span>路线管理</span>
            </template>
            <el-menu-item @click="menuHandler('luxianguanli')" index="5-1">路线管理</el-menu-item>
          </el-submenu>
          <el-submenu index="6">
            <template slot="title">
              <span>订单管理</span>
            </template>
            <el-menu-item @click="menuHandler('weizhifudingdan')" index="6-1">未支付订单</el-menu-item>
            <el-menu-item @click="menuHandler('yizhifudingdan')" index="6-2">已支付订单</el-menu-item>
            <el-menu-item @click="menuHandler('yiwanchengdingdan')" index="6-3">已完成订单</el-menu-item>
            <el-menu-item @click="menuHandler('yiquxiaodingdan')" index="6-4">已取消订单</el-menu-item>
            <el-menu-item @click="menuHandler('yituikuandingdan')" index="6-5">已退款订单</el-menu-item>
          </el-submenu>
          <el-submenu index="7">
            <template slot="title">
              <span>系统管理</span>
            </template>
            <el-menu-item @click="menuHandler('peizhiguanli')" index="7-1">配置管理</el-menu-item>
            <el-menu-item @click="menuHandler('renlianshangchuan')" index="7-2">人脸上传</el-menu-item>
            <el-menu-item @click="menuHandler('kefuguanli')" index="7-3">客服管理</el-menu-item>
          </el-submenu>
          <el-submenu index="8">
            <template slot="title">
              <span>刷表测试</span>
            </template>
            <el-menu-item @click="menuHandler('shangpinxinxi')" index="8-1">shangpinxinxi</el-menu-item>
            <el-menu-item @click="menuHandler('defaultUser')" index="8-2">defaultUser</el-menu-item>
            <el-menu-item @click="menuHandler('quyu')" index="8-3">quyu</el-menu-item>
            <el-menu-item @click="menuHandler('route')" index="8-4">route</el-menu-item>
            <el-menu-item @click="menuHandler('shangpinleibie')" index="8-5">shangpinleibie</el-menu-item>
            <el-menu-item @click="menuHandler('yuangong')" index="8-6">yuangong</el-menu-item>
            <el-menu-item @click="menuHandler('tushuxinxi')" index="8-7">tushuxinxi</el-menu-item>
          </el-submenu>
        </el-menu>
      </div> -->
    </div>
  </el-aside>
</template>
<script>
import menu from "@/utils/menu";
export default {
  data() {
    return {
      menuList: [],
      dynamicMenuRoutes: [],
      role: ""
    };
  },
  mounted() {
    let menus = menu.list();
    this.menuList = menus;
    this.role = this.$storage.get("role");
  },
  methods: {
    menuHandler(name) {
      this.$router.push({ name: name });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>

