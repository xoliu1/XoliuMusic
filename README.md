# 进度

1. 完成引导页，登录页
2. 完成抽屉布局主页的底部导航栏配置
3. 完成底部导航栏中"探索"页面的Fragment
4. 增加"探索"界面的卡片轮播图









# Demo构思（不断修改）

## 逻辑层

> 均为死数据，自己上传的数据和用来轮播的图，用Glide加载自己图床的图。

- [ ] 个人资料界面采用Bing每日一图（Retrofit + kotlin协程的学习实践）
- [ ] 用户自定义上传图片作为头像
- [x] 基本限制布局的构造
- [x] jetpack库的测试与实践
- [ ] 研究开源自定义控件并应用
- [ ] 音乐的基本播放功能
- [ ] 

## 界面层

不会写的直接ImageView + 截图 框架解决 :yum:

### 引导页

- [x] app启动引导界面的ViewPager以及动画效果
- [x] TextInputLayout的登录界面 (hint 字符串会自动移到 EditText 的左上角)

### 主界面

- [ ] 简单的音乐播放栏和进入后的界面
- [x] BottomNavigationView + navigation实现底部导航栏

#### toolbar

- [x] 探索界面的SearchView
- [x] 听歌识曲界面(dead)

#### 侧滑菜单

不准备写云贝中心、商城等功能，改成个人资料展示页面

- [ ] 个人界面PhotoView，支持缩放，响应手势，用于头像。
- [ ] 

### '发现'页

- [x] 多个ScrollView里边多个cardView
- [x] Xbanner实现首页导航图的图片海报轮播
- [ ] 

### '我的'页

- [ ] CardView嵌套RecyclerView
- [ ] PopupWindow的demo（歌单的更多选项）

### '关注'页

- [ ] 多个RecyclerView
- [ ] 滑动刷新

### '社区'页

- [ ] Tablayout的使用
- [ ] 只写广场页面

### '播客'页

- [ ] Tablayout的使用
- [ ] 







# 其他

参考的网易云音乐布局边界：

<img src="https://s2.loli.net/2023/10/22/41SiVRDo7z38uJ9.jpg" alt="0160b808508dea9f22c7e65c5b7e325" style="zoom:20%;" />

<img src="https://s2.loli.net/2023/10/22/p3CisIzJgEqMNuY.jpg" alt="d0443a7446d255cdd33c552267d3153" style="zoom:20%;" />