
## 官方学习文档

https://v3.cn.vuejs.org/

## 创建
```
npm init vite@latest frontend -- --template vue
cd frontend
npm install
```

## 运行
```
npm run dev
```


## install axios
```
npm install axios
```

## 配置api代理，解决跨域请求问题
> 在vite.config.js中添加一下代码
```
export default defineConfig({
  plugins: [vue()],

  /** 配置api代理，解决跨域请求问题 */
  server: {
    proxy: {
      '/api': {
        target: 'http://192.168.1.7:8080/api',
        changeOrigin: true,
        rewrite: path => path.replace(/^\/api/, '')
      }
    }
  }
})

```

## vite添加scss预处理
> 在vite.config.js中添加一下代码
```

/**配置scss预处理 */
  css: {
    preprocessorOptions: {
      scss: {
        additionalData: `$injectedColor: orange;`
      }
    }
  }

```

> 安装sass依赖

```
npm install sass -D
```

## 安装Element UI

> 安装elment ui依赖
```
cnpm install element-ui -S
```
### 全局引用element ui组件
> 代码中引入element-ui

```
// main.js中合适位置添加如下代码
//导入element ui js文件
import ElementUI from 'element-ui';
//导入element ui 样式文件
import 'element-ui/lib/theme-chalk/index.css';


// ...
Vue.use(ElementUI);

```

### 按需引入element ui组件
> 参考：https://element.eleme.cn/#/zh-CN/component/quickstart


### 大坑：
按照以上操作完成之后，发现没有毛用。search了一下，原来vue3必须要使用
Element-Plug插件才能引入：
> https://element-plus.gitee.io/zh-CN/guide/quickstart.html

> 安装插件：
```
npm install element-plus --save
```

> 代码如下：
```
// main.ts
import { createApp } from 'vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import App from './App.vue'

const app = createApp(App)

app.use(ElementPlus)
app.mount('#app')
```

