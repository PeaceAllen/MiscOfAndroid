
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

