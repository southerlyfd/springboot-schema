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
        <el-form-item v-if="type!='info'"  label="影音类别" prop="yingyinleibie">
          <el-select v-model="ruleForm.yingyinleibie" placeholder="请选择影音类别">
            <el-option
                v-for="(item,index) in yingyinleibieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.yingyinleibie" label="影音类别" prop="yingyinleibie">
              <el-input v-model="ruleForm.yingyinleibie" 
                placeholder="影音类别" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="type!='info'" label="封面" prop="fengmian">
          <file-upload
          tip="点击上传封面"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.fengmian?ruleForm.fengmian:''"
          @change="fengmianUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.fengmian" label="封面" prop="fengmian">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fengmian.split(',')" :src="item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="全新价格" prop="quanxinjiage">
          <el-input v-model="ruleForm.quanxinjiage" 
              placeholder="全新价格" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.quanxinjiage" label="全新价格" prop="quanxinjiage">
              <el-input v-model="ruleForm.quanxinjiage" 
                placeholder="全新价格" readonly></el-input>
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
        <el-form-item v-if="type!='info'"  label="新旧程度" prop="xinjiuchengdu">
          <el-select v-model="ruleForm.xinjiuchengdu" placeholder="请选择新旧程度">
            <el-option
                v-for="(item,index) in xinjiuchengduOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.xinjiuchengdu" label="新旧程度" prop="xinjiuchengdu">
              <el-input v-model="ruleForm.xinjiuchengdu" 
                placeholder="新旧程度" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                          <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="赞" prop="thumbsupnum">
          <el-input v-model="ruleForm.thumbsupnum" 
              placeholder="赞" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.thumbsupnum" label="赞" prop="thumbsupnum">
              <el-input v-model="ruleForm.thumbsupnum" 
                placeholder="赞" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="踩" prop="crazilynum">
          <el-input v-model="ruleForm.crazilynum" 
              placeholder="踩" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.crazilynum" label="踩" prop="crazilynum">
              <el-input v-model="ruleForm.crazilynum" 
                placeholder="踩" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                  </el-row>
                                                                                                                                                                                                                                                                                                        <el-row>
            <el-col :span="24">
              <el-form-item v-if="type!='info'"  label="影音介绍" prop="yingyinjieshao">
                <editor 
                    style="min-width: 200px; max-width: 600px;"
                    v-model="ruleForm.yingyinjieshao" 
                    class="editor" 
                    action="file/upload">
                </editor>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.yingyinjieshao" label="影音介绍" prop="yingyinjieshao">
                    <span v-html="ruleForm.yingyinjieshao"></span>
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
                                fengmian: '',
                                quanxinjiage: '',
                                ershoujiage: '',
                                xinjiuchengdu: '',
                                yingyinjieshao: '',
                                thumbsupnum: '',
                                crazilynum: '',
                      },
                                                                  yingyinleibieOptions: [],
                                                                          xinjiuchengduOptions: [],
                                                              rules: {
                  maijiahao: [
                                                                                              ],
                  xingming: [
                                                                                              ],
                  yingyinmingcheng: [
                                                                                              ],
                  yingyinleibie: [
                                                                                              ],
                  fengmian: [
                                                                                              ],
                  quanxinjiage: [
                                                                                              ],
                  ershoujiage: [
                                                                                              ],
                  xinjiuchengdu: [
                                                                                              ],
                  yingyinjieshao: [
                                                                                              ],
                  thumbsupnum: [
                                        { validator: validateIntNumber, trigger: 'blur' },
                                                                                  ],
                  crazilynum: [
                                        { validator: validateIntNumber, trigger: 'blur' },
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
                    if(o=='fengmian'){
            this.ruleForm.fengmian = obj[o];
            continue;
          }
                    if(o=='quanxinjiage'){
            this.ruleForm.quanxinjiage = obj[o];
            continue;
          }
                    if(o=='ershoujiage'){
            this.ruleForm.ershoujiage = obj[o];
            continue;
          }
                    if(o=='xinjiuchengdu'){
            this.ruleForm.xinjiuchengdu = obj[o];
            continue;
          }
                    if(o=='yingyinjieshao'){
            this.ruleForm.yingyinjieshao = obj[o];
            continue;
          }
                    if(o=='thumbsupnum'){
            this.ruleForm.thumbsupnum = obj[o];
            continue;
          }
                    if(o=='crazilynum'){
            this.ruleForm.crazilynum = obj[o];
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
                                    this.ruleForm.maijiahao = json.maijiahao
                                                this.ruleForm.xingming = json.xingming
                                                                                                                                                                                                                                    } else {
          this.$message.error(data.msg);
        }
      });
                                                                                                this.$http({
              url: `option/yingyinfenlei/yingyinleibie`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.yingyinleibieOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
         
                                                                                              this.xinjiuchengduOptions = "10,9,8,7,6,5,4,3,2,1".split(',')
                                                                                  },
                                                                                                // 多级联动参数
                                                                                                                          info(id) {
      this.$http({
        url: `ershouyingyin/info/${id}`,
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
            url: `ershouyingyin/${!this.ruleForm.id ? "save" : "update"}`,
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
                  this.parent.ershouyingyinCrossAddOrUpdateFlag = false;
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
      this.parent.ershouyingyinCrossAddOrUpdateFlag = false;
    },
                                                                        fengmianUploadChange(fileUrls) {
                this.ruleForm.fengmian = fileUrls;
            },
                                                                                      }
};
</script>
<style lang="scss" scoped>
.editor{
  height: 500px;
}
</style>
