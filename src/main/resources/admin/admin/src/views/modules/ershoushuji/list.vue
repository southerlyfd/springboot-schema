<template>
  <div class="main-content">
    <!-- 列表页 -->
    <div v-if="showFlag">
      <el-form :inline="true" :model="searchForm" class="form-content">
                                            <el-form-item label="卖家号">
                <el-input v-model="searchForm.maijiahao" 
                    placeholder="卖家号" clearable></el-input>
              </el-form-item>
                                                                                    <el-form-item label="书籍名称">
                <el-input v-model="searchForm.shujimingcheng" 
                    placeholder="书籍名称" clearable></el-input>
              </el-form-item>
                                                                  <el-form-item label="书籍类别">
                <el-input v-model="searchForm.shujileibie" 
                    placeholder="书籍类别" clearable></el-input>
              </el-form-item>
                                                                  <el-form-item label="作者">
                <el-input v-model="searchForm.zuozhe" 
                    placeholder="作者" clearable></el-input>
              </el-form-item>
                                                                                                                                          <el-form-item label="简介">
                <el-input v-model="searchForm.jianjie" 
                    placeholder="简介" clearable></el-input>
              </el-form-item>
                                                                          <el-form-item>
          <el-button round @click="search()">查询</el-button>
          <el-button
            v-if="isAuth('ershoushuji','新增')"
            type="primary"
            @click="addOrUpdateHandler()"
            round
          >新增</el-button>
          <el-button
            v-if="isAuth('ershoushuji','删除')"
            :disabled="dataListSelections.length <= 0"
            type="danger"
            @click="deleteHandler()"
            round
          >删除</el-button>
                  </el-form-item>
      </el-form>
      <div class="table-content">
        <el-table
            v-if="isAuth('ershoushuji','查看')"
            :data="dataList"
            border
            v-loading="dataListLoading"
            @selection-change="selectionChangeHandler"
            style="width: 100%;">
            <el-table-column
                type="selection"
                header-align="center"
                align="center"
                width="50">
            </el-table-column>
                                            <el-table-column
                    prop="maijiahao"
                    header-align="center"
                    align="center"
                    sortable
                    label="卖家号">
                    <template slot-scope="scope">
                      {{scope.row.maijiahao}}
                    </template>
                </el-table-column>
                                                            <el-table-column
                    prop="xingming"
                    header-align="center"
                    align="center"
                    sortable
                    label="姓名">
                    <template slot-scope="scope">
                      {{scope.row.xingming}}
                    </template>
                </el-table-column>
                                                            <el-table-column
                    prop="shujimingcheng"
                    header-align="center"
                    align="center"
                    sortable
                    label="书籍名称">
                    <template slot-scope="scope">
                      {{scope.row.shujimingcheng}}
                    </template>
                </el-table-column>
                                                            <el-table-column
                    prop="shujileibie"
                    header-align="center"
                    align="center"
                    sortable
                    label="书籍类别">
                    <template slot-scope="scope">
                      {{scope.row.shujileibie}}
                    </template>
                </el-table-column>
                                                            <el-table-column
                    prop="zuozhe"
                    header-align="center"
                    align="center"
                    sortable
                    label="作者">
                    <template slot-scope="scope">
                      {{scope.row.zuozhe}}
                    </template>
                </el-table-column>
                                                              <el-table-column prop="shujifengmian" 
                    header-align="center"
                    align="center" 
                    width="200" 
                    label="书籍封面">
                    <template slot-scope="scope">
                      <div v-if="scope.row.shujifengmian">
                        <img :src="scope.row.shujifengmian.split(',')[0]" min-width="100" height="100">
                      </div>
                      <div v-else>无图片</div>
                    </template>
                  </el-table-column>
                                                            <el-table-column
                    prop="quanxinjiage"
                    header-align="center"
                    align="center"
                    sortable
                    label="全新价格">
                    <template slot-scope="scope">
                      {{scope.row.quanxinjiage}}
                    </template>
                </el-table-column>
                                                            <el-table-column
                    prop="ershoujiage"
                    header-align="center"
                    align="center"
                    sortable
                    label="二手价格">
                    <template slot-scope="scope">
                      {{scope.row.ershoujiage}}
                    </template>
                </el-table-column>
                                                            <el-table-column
                    prop="xinjiuchengdu"
                    header-align="center"
                    align="center"
                    sortable
                    label="新旧程度">
                    <template slot-scope="scope">
                      {{scope.row.xinjiuchengdu}}
                    </template>
                </el-table-column>
                                                                                                        <el-table-column
                    prop="thumbsupnum"
                    header-align="center"
                    align="center"
                    sortable
                    label="赞">
                    <template slot-scope="scope">
                      {{scope.row.thumbsupnum}}
                    </template>
                </el-table-column>
                                                            <el-table-column
                    prop="crazilynum"
                    header-align="center"
                    align="center"
                    sortable
                    label="踩">
                    <template slot-scope="scope">
                      {{scope.row.crazilynum}}
                    </template>
                </el-table-column>
                                                    <el-table-column
                header-align="center"
                align="center"
                label="操作">
                <template slot-scope="scope">
                                <el-button v-if="isAuth('ershoushuji','查看')" type="text" icon="el-icon-edit" size="small" @click="addOrUpdateHandler(scope.row.id,'info')">详情</el-button>
                                                                <el-button v-if="isAuth('ershoushuji','购买')" type="text" icon="el-icon-edit" size="small" @click="ershoushujidingdanCrossAddOrUpdateHandler(scope.row,'cross')">购买</el-button>
                                                                <el-button v-if="isAuth('ershoushuji','修改')" type="text" icon="el-icon-edit" size="small" @click="addOrUpdateHandler(scope.row.id)">修改</el-button>
                <el-button v-if="isAuth('ershoushuji','删除')" type="text" icon="el-icon-delete" size="small" @click="deleteHandler(scope.row.id)">删除</el-button>
                </template>
            </el-table-column>
        </el-table>
                                                                                                                                                                                                                <el-pagination
          @size-change="sizeChangeHandle"
          @current-change="currentChangeHandle"
          :current-page="pageIndex"
          :page-sizes="[10, 20, 50, 100]"
          :page-size="pageSize"
          :total="totalPage"
          layout="total, sizes, prev, pager, next, jumper"
          class="pagination-content"
        ></el-pagination>
      </div>
    </div>
    <!-- 添加/修改页面  将父组件的search方法传递给子组件-->
    <add-or-update v-if="addOrUpdateFlag" :parent="this" ref="addOrUpdate"></add-or-update>

            <ershoushujidingdan-cross-add-or-update v-if="ershoushujidingdanCrossAddOrUpdateFlag" :parent="this" ref="ershoushujidingdanCrossaddOrUpdate"></ershoushujidingdan-cross-add-or-update>
        
    
    
  </div>
</template>
<script>
import AddOrUpdate from "./add-or-update";
import ershoushujidingdanCrossAddOrUpdate from "../ershoushujidingdan/add-or-update";
export default {
  data() {
    return {
                                                                                                            shujileibieOptions: [],
                                                                                                                                                                                                searchForm: {
        key: ""
      },
      dataList: [],
      pageIndex: 1,
      pageSize: 10,
      totalPage: 0,
      dataListLoading: false,
      dataListSelections: [],
      showFlag: true,
      sfshVisiable: false,
      shForm: {},
      chartVisiable: false,
      addOrUpdateFlag:false,
                  ershoushujidingdanCrossAddOrUpdateFlag: false,
                };
  },
  mounted() {
    this.init();
    this.getDataList();
  },
  filters: {
    htmlfilter: function (val) {
      return val.replace(/<[^>]*>/g).replace(/undefined/g,'');
    }
  },
  components: {
    AddOrUpdate,
            ershoushujidingdanCrossAddOrUpdate,
          },
  methods: {
            ershoushujidingdanCrossAddOrUpdateHandler(row,type){
      this.showFlag = false;
      this.addOrUpdateFlag = false;
      this.ershoushujidingdanCrossAddOrUpdateFlag = true;
      this.$storage.set('crossObj',row);
      this.$storage.set('crossTable','ershoushuji');
      this.$nextTick(() => {
        this.$refs.ershoushujidingdanCrossaddOrUpdate.init(row.id,type);
      });
    },
                    init () {
                                                                                              this.$http({
            url: `option/shujifenlei/shujileibie`,
            method: "get"
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.shujileibieOptions = data.data;
            } else {
              this.$message.error(data.msg);
            }
          });
                                                                                                                                                                                                                                                                                                                                  },
    search() {
      this.pageIndex = 1;
      this.getDataList();
    },
    // 获取数据列表
    getDataList() {
      this.dataListLoading = true;
      let params = {
        page: this.pageIndex,
        limit: this.pageSize,
        sort: 'id',
      }
                                          if(this.searchForm.maijiahao!='' && this.searchForm.maijiahao!=undefined){
            params['maijiahao'] = '%' + this.searchForm.maijiahao + '%'
          }
                                                                                  if(this.searchForm.shujimingcheng!='' && this.searchForm.shujimingcheng!=undefined){
            params['shujimingcheng'] = '%' + this.searchForm.shujimingcheng + '%'
          }
                                                            if(this.searchForm.shujileibie!='' && this.searchForm.shujileibie!=undefined){
            params['shujileibie'] = '%' + this.searchForm.shujileibie + '%'
          }
                                                            if(this.searchForm.zuozhe!='' && this.searchForm.zuozhe!=undefined){
            params['zuozhe'] = '%' + this.searchForm.zuozhe + '%'
          }
                                                                                                                                                    if(this.searchForm.jianjie!='' && this.searchForm.jianjie!=undefined){
            params['jianjie'] = '%' + this.searchForm.jianjie + '%'
          }
                                                                          this.$http({
        url: "ershoushuji/page",
        method: "get",
        params: params
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.dataList = data.data.list;
          this.totalPage = data.data.total;
        } else {
          this.dataList = [];
          this.totalPage = 0;
        }
        this.dataListLoading = false;
      });
    },
    // 每页数
    sizeChangeHandle(val) {
      this.pageSize = val;
      this.pageIndex = 1;
      this.getDataList();
    },
    // 当前页
    currentChangeHandle(val) {
      this.pageIndex = val;
      this.getDataList();
    },
    // 多选
    selectionChangeHandler(val) {
      this.dataListSelections = val;
    },
    // 添加/修改
    addOrUpdateHandler(id,type) {
      this.showFlag = false;
      this.addOrUpdateFlag = true;
      this.crossAddOrUpdateFlag = false;
      if(type!='info'){
        type = 'else';
      }
      this.$nextTick(() => {
        this.$refs.addOrUpdate.init(id,type);
      });
    },
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 删除
    deleteHandler(id) {
      var ids = id
        ? [Number(id)]
        : this.dataListSelections.map(item => {
            return Number(item.id);
          });
      this.$confirm(`确定进行[${id ? "删除" : "批量删除"}]操作?`, "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      }).then(() => {
        this.$http({
          url: "ershoushuji/delete",
          method: "post",
          data: ids
        }).then(({ data }) => {
          if (data && data.code === 0) {
            this.$message({
              message: "操作成功",
              type: "success",
              duration: 1500,
              onClose: () => {
                this.search();
              }
            });
          } else {
            this.$message.error(data.msg);
          }
        });
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
