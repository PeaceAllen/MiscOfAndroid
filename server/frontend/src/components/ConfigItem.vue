<template>

    <div @click="reqAllConfiurations">
        click me
    </div>
  <ul>
      <li v-for="config in configs" :key="config.key">
         index = {{config.key}}, value = {{config.value}}
      </li>
  </ul>
</template>

<script>
import axios from 'axios';

export default {

    data() {
        return {
            configs: [
                {'key': 'key-1', 'value': 'value-1'},
                {'key': 'key-2', 'value': 'value-2'},
            ]
        }
    },

    methods: {
        reqAllConfiurations() {

            axios.request({
                url: "http://127.0.0.1:8080/api/config/all",
                method: "post"
            }).then((res) => {
                console.dir(res)
            }).catch((error) => {
                console.error(error)
            })


        }
    }
    
}
</script>

<style>

</style>