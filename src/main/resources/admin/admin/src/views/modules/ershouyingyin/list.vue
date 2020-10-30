<template>
  <div class="main-content">
    <!-- 列表页 -->
    <div v-if="showFlag">
      <el-form :inline="true" :model="searchForm" class="form-content">
                                            <el-form-item label="卖家号">
                <el-input v-model="searchForm.maijiahao" 
                    placeholder="卖家号" clearable></el-input>
              </el-form-item>
                                                                                    <el-form-item label="影音名称">
                <el-input v-model="searchForm.yingyinmingcheng" 
                    placeholder="影音名称" clearable></el-input>
              </el-form-item>
                                                                  <el-form-item label="影音类别">
                <el-input v-model="searchForm.yingyinleibie" 
                    placeholder="影音类别" clearable></el-input>
              </el-form-item>
                                                                                                                                                                    <el-form-item>
          <el-button round @click="search()">查询</el-button>
          <el-button
            v-if="isAuth('ershouyingyin','新增')"
            type="primary"
            @click="addOrUpdateHandler()"
            round
          >新增</el-button>
          <el-button
            v-if="isAuth('ershouyingyin','删除')"
            :disabled="dataListSelections.length <= 0"
            type="danger"
            @click="deleteHandler()"
            round
          >删除</el-button>
                  </el-form-item>
      </el-form>
      <div class="table-content">
        <el-table
            v-if="isAuth('ershouyingyin','查看')"
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
                    prop="yingyinmingcheng"
                    header-align="center"
                    align="center"
                    sortable
                    label="影音名称">
                    <template slot-scope="scope">
                      {{scope.row.yingyinmingcheng}}
                    </template>
                </el-table-column>
                                                            <el-table-column
                    prop="yingyinleibie"
                    header-align="center"
                    align="center"
                    sortable
                    label="影音类别">
                    <template slot-scope="scope">
                      {{scope.row.yingyinleibie}}
                    </template>
                </el-table-column>
                                                              <el-table-column prop="fengmian" 
                    header-align="center"
                    align="center" 
                    width="200" 
                    label="封面">
                    <template slot-scope="scope">
                      <div v-if="scope.row.fengmian">
                        <img :src="scope.row.fengmian.split(',')[0]" min-width="100" height="100">
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
                                <el-button v-if="isAuth('ershouyingyin','查看')" type="text" icon="el-icon-edit" size="small" @click="addOrUpdateHandler(scope.row.id,'info')">详情</el-button>
                                                                <el-button v-if="isAuth('ershouyingyin','购买')" type="text" icon="el-icon-edit" size="small" @click="ershouyingyindingdanCrossAddOrUpdateHandler(scope.row,'cross')">购买</el-button>
                                                                <el-button v-if="isAuth('ershouyingyin','修改')" type="text" icon="el-icon-edit" size="small" @click="addOrUpdateHandler(scope.row.id)">修改</el-button>
                <el-button v-if="isAuth('ershouyingyin','删除')" type="text" icon="el-icon-delete" size="small" @click="deleteHandler(scope.row.id)">删除</el-button>
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

            <ershouyingyindingdan-cross-add-or-update v-if="ershouyingyindingdanCrossAddOrUpdateFlag" :parent="this" ref="ershouyingyindingdanCrossaddOrUpdate"></ershouyingyindingdan-cross-add-or-update>
        
    
    
  </div>
</template>
<script>
import AddOrUpdate from "./add-or-update";
import ershouyingyindingdanCrossAddOrUpdate from "../ershouyingyindingdan/add-or-update";
export default {
  data() {
    return {
                                                                                                            yingyinleibieOptions: [],
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
                  ershouyingyindingdanCrossAddOrUpdateFlag: false,
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
            ershouyingyindingdanCrossAddOrUpdate,
          },
  methods: {
            ershouyingyindingdanCrossAddOrUpdateHandler(row,type){
      this.showFlag = false;
      this.addOrUpdateFlag = false;
      this.ershouyingyindingdanCrossAddOrUpdateFlag = true;
      this.$storage.set('crossObj',row);
      this.$storage.set('crossTable','ershouyingyin');
      this.$nextTick(() => {
        this.$refs.ershouyingyindingdanCrossaddOrUpdate.init(row.id,type);
      });
    },
                    init () {
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
                                                                                  if(this.searchForm.yingyinmingcheng!='' && this.searchForm.yingyinmingcheng!=undefined){
            params['yingyinmingcheng'] = '%' + this.searchForm.yingyinmingcheng + '%'
          }
                                                            if(this.searchForm.yingyinleibie!='' && this.searchForm.yingyinleibie!=undefined){
            params['yingyinleibie'] = '%' + this.searchForm.yingyinleibie + '%'
          }
                                                                                                                                                                                        this.$http({
        url: "ershouyingyin/page",
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
          url: "ershouyingyin/delete",
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
