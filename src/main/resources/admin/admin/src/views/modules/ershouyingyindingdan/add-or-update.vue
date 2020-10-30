<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
      <el-row>
                  <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="卖家号" prop="maijiahao">
          <el-input v-model="ruleForm.maijiahao" 
              placeholder="卖家号" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.maijiahao" label="卖家号" prop="maijiahao">
              <el-input v-model="ruleForm.maijiahao" 
                placeholder="卖家号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.xingming" label="姓名" prop="xingming">
              <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="影音名称" prop="yingyinmingcheng">
          <el-input v-model="ruleForm.yingyinmingcheng" 
              placeholder="影音名称" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.yingyinmingcheng" label="影音名称" prop="yingyinmingcheng">
              <el-input v-model="ruleForm.yingyinmingcheng" 
                placeholder="影音名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="影音类别" prop="yingyinleibie">
          <el-input v-model="ruleForm.yingyinleibie" 
              placeholder="影音类别" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.yingyinleibie" label="影音类别" prop="yingyinleibie">
              <el-input v-model="ruleForm.yingyinleibie" 
                placeholder="影音类别" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="二手价格" prop="ershoujiage">
          <el-input v-model="ruleForm.ershoujiage" 
              placeholder="二手价格" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.ershoujiage" label="二手价格" prop="ershoujiage">
              <el-input v-model="ruleForm.ershoujiage" 
                placeholder="二手价格" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="用户名" prop="yonghuming">
          <el-input v-model="ruleForm.yonghuming" 
              placeholder="用户名" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.yonghuming" label="用户名" prop="yonghuming">
              <el-input v-model="ruleForm.yonghuming" 
                placeholder="用户名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="收货地址" prop="shouhuodizhi">
          <el-input v-model="ruleForm.shouhuodizhi" 
              placeholder="收货地址" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.shouhuodizhi" label="收货地址" prop="shouhuodizhi">
              <el-input v-model="ruleForm.shouhuodizhi" 
                placeholder="收货地址" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="收货人" prop="shouhuoren">
          <el-input v-model="ruleForm.shouhuoren" 
              placeholder="收货人" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.shouhuoren" label="收货人" prop="shouhuoren">
              <el-input v-model="ruleForm.shouhuoren" 
                placeholder="收货人" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua" 
              placeholder="联系电话" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.lianxidianhua" label="联系电话" prop="lianxidianhua">
              <el-input v-model="ruleForm.lianxidianhua" 
                placeholder="联系电话" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="订单备注" prop="dingdanbeizhu">
          <el-input v-model="ruleForm.dingdanbeizhu" 
              placeholder="订单备注" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.dingdanbeizhu" label="订单备注" prop="dingdanbeizhu">
              <el-input v-model="ruleForm.dingdanbeizhu" 
                placeholder="订单备注" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    </el-row>
                                                                                                                                                                                                                                                                                                                                      <el-form-item>
                <el-button v-if="type!='info'" type="primary" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
      id: '',
      type: '',
      ruleForm: {
                        maijiahao: '',
                                xingming: '',
                                yingyinmingcheng: '',
                                yingyinleibie: '',
                                ershoujiage: '',
                                yonghuming: '',
                                shouhuodizhi: '',
                                shouhuoren: '',
                                lianxidianhua: '',
                                dingdanbeizhu: '',
                                ispay: '',
                      },
                                                                                                                                                                      rules: {
                  maijiahao: [
                                                                                              ],
                  xingming: [
                                                                                              ],
                  yingyinmingcheng: [
                                                                                              ],
                  yingyinleibie: [
                                                                                              ],
                  ershoujiage: [
                                                                                              ],
                  yonghuming: [
                                                                                              ],
                  shouhuodizhi: [
                                                                                              ],
                  shouhuoren: [
                                                                                              ],
                  lianxidianhua: [
                                                                                              ],
                  dingdanbeizhu: [
                                                                                              ],
                  ispay: [
                                                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                                                                          },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
                    if(o=='maijiahao'){
            this.ruleForm.maijiahao = obj[o];
            continue;
          }
                    if(o=='xingming'){
            this.ruleForm.xingming = obj[o];
            continue;
          }
                    if(o=='yingyinmingcheng'){
            this.ruleForm.yingyinmingcheng = obj[o];
            continue;
          }
                    if(o=='yingyinleibie'){
            this.ruleForm.yingyinleibie = obj[o];
            continue;
          }
                    if(o=='ershoujiage'){
            this.ruleForm.ershoujiage = obj[o];
            continue;
          }
                    if(o=='yonghuming'){
            this.ruleForm.yonghuming = obj[o];
            continue;
          }
                    if(o=='shouhuodizhi'){
            this.ruleForm.shouhuodizhi = obj[o];
            continue;
          }
                    if(o=='shouhuoren'){
            this.ruleForm.shouhuoren = obj[o];
            continue;
          }
                    if(o=='lianxidianhua'){
            this.ruleForm.lianxidianhua = obj[o];
            continue;
          }
                    if(o=='dingdanbeizhu'){
            this.ruleForm.dingdanbeizhu = obj[o];
            continue;
          }
                    if(o=='ispay'){
            this.ruleForm.ispay = obj[o];
            continue;
          }
                  }
                                                                                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                                                                                                                                  this.ruleForm.yonghuming = json.yonghuming
                                                                                                                                            } else {
          this.$message.error(data.msg);
        }
      });
                                                                                                                                                                                                                                    },
                                                                                                // 多级联动参数
                                                                                                                          info(id) {
      this.$http({
        url: `ershouyingyindingdan/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                                                                                                                                                                                                                                                                                          this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `ershouyingyindingdan/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.ershouyingyindingdanCrossAddOrUpdateFlag = false;
                  this.parent.search();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.ershouyingyindingdanCrossAddOrUpdateFlag = false;
    },
                                                                                                                                          }
};
</script>
<style lang="scss" scoped>
.editor{
  height: 500px;
}
</style>
