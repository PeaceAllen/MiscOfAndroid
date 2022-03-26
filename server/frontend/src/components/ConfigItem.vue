<template>
  <div>
      <h2>基本配置key-value</h2>
      <div class="add-from-wrapper">
          <form @submit.prevent="submitAddConfig">
            <input type="text" name="key" v-model="keyToAdd">
            <input type="text" name="value" v-model="valueToAdd">
            <input type="submit" value="Add">
          </form>
      </div>

      <ul class="all-config-list">
            <li v-for="config in configs" :key="config.key">
                index = {{config.key}}, value = {{config.value}}
                <span class="del-button" @click="submitDelConfig(config.key)">删除</span>
            </li>
        </ul>

  </div>
</template>

<script>
import http from '../utils/http_utils.js';

export default {

    data() {
        return {
            keyToAdd: "",
            valueToAdd: "",
            configs: [],
        }
    },

    methods: {
        reqAllConfiurations() {
            http.get("/api/config/all", {}
            ).then((res) => {
                console.dir(res)
                this.configs = res.data.data
                // this.configs.push(...res.data.data)
            }).catch((error) => {
                console.error(error)
            })
        },
        submitAddConfig() {
            
            http.post("/api/config/add",{
                key: this.keyToAdd,
                value: this.valueToAdd,
            }).then( (res) => {
                console.dir(res)
                this.refresh()
            }).catch((err) => {
                console.error(err)
            })


        },
        submitDelConfig(key) {
            
            http.post("/api/config/del",{
                key: key
            }).then( (res) => {
                console.dir(res)
                this.refresh()
            }).catch((err) => {
                console.error(err)
            })
        },
        refresh() {
            this.reqAllConfiurations()
        }
    },

    mounted() {
        console.log("on mounted")
        this.reqAllConfiurations()
    }
    
}
</script>

<style lang="scss" scoped>
* {
  margin: 0;
  padding: 0;
}
.all-config-list {

    list-style-type: none;
    li {
        display: block;
        line-height: 40px;
        background-color: #f0f0f0;
        .del-button {
            display: inline-block;
            line-height: 40px;
            float: right;
            background-color: #eee;
            padding-left: 10px;
            padding-right: 10px;
            &:hover {
                background-color: #ccc;
            }
        }
        &:hover {
            background-color: #e0e0e0;
        }
    }
    
}
.add-from-wrapper {
    display: block;
    height: 50px;

    form {
        input {
            display: inline-block;
            line-height: 40px;
            margin-left: 10px;
            margin-right: 10px;
        }
    }


}
</style>>