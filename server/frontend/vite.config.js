import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
const path = require("path");


// https://vitejs.dev/config/
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
  },

  /**配置scss预处理 */
  css: {
    preprocessorOptions: {
      scss: {
        additionalData: `$injectedColor: orange;`
      }
    }
  }
})
