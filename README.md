23/11/3，停止demo，进行笔记整理.....

毕竟只是个demo不想写这么久，下边会有展示↓↓↓

# Demo-version 0.7 

> 用的是录屏转gif，加载动图出来会有些慢，请耐心等待:coffee:

## 引导页SplashActivity

代码学习了github上的wobiancao的demo：[Music163GuideDemo](https://github.com/wobiancao/Music163GuideDemo) ，(项目里唯一的java部分,因为kotlin没那么熟练)，我觉得很好看！:heart:

效果：

![Splash.gif](https://s2.loli.net/2023/11/03/mudPFAqS58fGk9e.gif)



## 登录页LoginActivity

用了`TextInputLayout`和`TextInputEditText`  有hint自动上移的动效和多种输入限制，中间输密码黑屏，是因为小米录屏检测到了密码，自动黑屏保护

下边文字是可以点的:blush:

![login.gif](https://s2.loli.net/2023/11/03/wM8JDkZVc2QfNxj.gif)

## 主界面

光写了个主体壳子，主要内容是那些fragment

- 用到`BottomNavigationView`配置menu项生成底部导航栏
- `FragmentContainerView`配置 `app:navGraph` 属性，绑定各个导航项对应碎片。(Fragment也行，方式不一样)



## 发现页

简单的页面仿写，用到`SearchView` `CardView`等

- 多个里边多个`cardView`打的`ScrollView`

- 第三方库 `Xbanner`实现首页导航图的图片海报轮播，Glide加载对应url

  ![explore.gif](https://s2.loli.net/2023/11/03/E9nbTczhaIQDlFC.gif)

## 我的页

大体界面仿写，以及`TabLayout` 的使用

- `tabItem`事件绑定：`scrollview`滑动到对应指定内容
- 滑动悬浮栏,下滑超过tablayout时，显示歌单栏，上滑出去不会显示。
- 听歌状态的文字跑马灯效果(死数据，不会根据当前歌名改变而改变TextView的内容)

![mine.gif](https://s2.loli.net/2023/11/03/PosthHKYMlIRn4E.gif)

## 关注页

就这

![guanzhu.gif](https://s2.loli.net/2023/11/03/ypqxjSRCEcU5Hhn.gif)

## 社区页

进入效果：

![WeChat_2023112513l.gif](https://s2.loli.net/2023/11/25/6O7GY4A5c8lZnUv.gif)

![sheqv.gif](https://s2.loli.net/2023/11/03/8qK5lWwuvJIS6fA.gif)



# Demo构思（不断修改）

## 逻辑层

> 均为死数据，自己上传的数据和用来轮播的图，用Glide加载自己图床的图。

- [ ] 个人资料界面采用Bing每日一图（Retrofit + kotlin协程的学习实践）
- [ ] 用户自定义上传图片作为头像
- [x] 基本限制布局的构造
- [x] jetpack库的测试与实践
- [x] 研究开源自定义控件并应用
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
- [ ] ~~全界面同一个toolbar~~  - >  仅'发现'页附带搜索导航栏toolbar 

#### toolbar

- [x] 探索界面的SearchView
- [x] 听歌识曲界面(dead)

#### 侧滑菜单

不准备写云贝中心、商城等功能，改成个人资料展示页面

- [ ] 个人界面PhotoView，支持缩放，响应手势，用于头像。
- [ ] 个人信息以及其他选项

目前没有写的打算.....

### '发现'页

- [x] 多个ScrollView里边多个cardView
- [x] Xbanner实现首页导航图的图片海报轮播
- [ ] 

### '我的'页

- [x] CardView嵌套RecyclerView
- [x] Tablayout的使用
- [x] tabItem事件绑定：scrollview滑动到对应指定内容
- [x] 听歌状态的文字跑马灯效果(死数据，不会根据当前歌名改变)
- [x] 滑动悬浮栏,下滑时，显示歌单栏

### '关注'页

- [x] 多个RecyclerView(增加滑入动画 )
- [ ] 滑动刷新

### '社区'页

- [x] Tablayout的使用
- [x] 乐迷团横向RecyclerView(增加滑入动画 )
- [x] 广场的动态页面

### '播客'页（已弃用）

- [ ] PopupWindow的demo
- [ ] 





:neutral_face:

# 其他

我参考的官方网易云音乐布局边界：

<img src="https://s2.loli.net/2023/10/22/41SiVRDo7z38uJ9.jpg" alt="0160b808508dea9f22c7e65c5b7e325" style="zoom:20%;" />

<img src="https://s2.loli.net/2023/10/22/p3CisIzJgEqMNuY.jpg" alt="d0443a7446d255cdd33c552267d3153" style="zoom:20%;" />