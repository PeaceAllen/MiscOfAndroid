
import { createRouter, createWebHashHistory } from 'vue-router'


// 1. 定义路由组件.
// 也可以从其他文件导入
import AdminMain from '../page/AdminMain.vue';
import CoinfigItem from '../components/ConfigItem.vue';

// 2. 定义一些路由,也支持嵌套路由
const routes = [
    {
        path: '/', 
        component: AdminMain,
        children: [
            {
                path: '',
                component: CoinfigItem,
            }
        ]
    },
]

// 3. 创建路由实例并传递 `routes` 配置
// 你可以在这里输入更多的配置，但我们在这里
// 暂时保持简单
const router = createRouter({
  // 4. 内部提供了 history 模式的实现。为了简单起见，我们在这里使用 hash 模式。
  history: createWebHashHistory(),
  routes, // `routes: routes` 的缩写
});

export default router;