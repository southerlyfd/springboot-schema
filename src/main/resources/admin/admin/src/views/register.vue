<template>
  <div>
    <img class="bg" src="@/assets/img/bg.jpg">
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" class="login-form">
      <h1 class="h1">商品交易平台注册</h1>
                                                                              <el-form-item v-if="tableName=='maijia'" label="卖家号" prop="maijiamaijiahao">
        <el-input v-model="ruleForm.maijiahao" placeholder="卖家号"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='maijia'" label="密码" prop="maijiamima">
        <el-input v-model="ruleForm.mima" placeholder="密码"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='maijia'" label="姓名" prop="maijiaxingming">
        <el-input v-model="ruleForm.xingming" placeholder="姓名"></el-input>
      </el-form-item>
                                                            <el-form-item v-if="tableName=='maijia'" label="手机" prop="maijiashouji">
        <el-input v-model="ruleForm.shouji" placeholder="手机"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='maijia'" label="身份证" prop="maijiashenfenzheng">
        <el-input v-model="ruleForm.shenfenzheng" placeholder="身份证"></el-input>
      </el-form-item>
                                                                        <el-form-item v-if="tableName=='yonghu'" label="用户名" prop="yonghuyonghuming">
        <el-input v-model="ruleForm.yonghuming" placeholder="用户名"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='yonghu'" label="密码" prop="yonghumima">
        <el-input v-model="ruleForm.mima" placeholder="密码"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='yonghu'" label="姓名" prop="yonghuxingming">
        <el-input v-model="ruleForm.xingming" placeholder="姓名"></el-input>
      </el-form-item>
                                                            <el-form-item v-if="tableName=='yonghu'" label="手机" prop="yonghushouji">
        <el-input v-model="ruleForm.shouji" placeholder="手机"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='yonghu'" label="微信" prop="yonghuweixin">
        <el-input v-model="ruleForm.weixin" placeholder="微信"></el-input>
      </el-form-item>
                                                                              <el-button @click="login()" class="btn-login" type="primary">注册</el-button>
    </el-form>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
              },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 注册
    login() {
                                                                                                                                                                                                                                                                                                                                                if(`maijia` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入电话格式`);
        return
      }
                                                                        if(`maijia` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
                                                                                                                                                                                                                                                                                                                                                if(`yonghu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入电话格式`);
        return
      }
                                                                                                                                                this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `${this.tableName}/register`,
            method: "post",
            data:this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$router.replace({ path: "/login" });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
